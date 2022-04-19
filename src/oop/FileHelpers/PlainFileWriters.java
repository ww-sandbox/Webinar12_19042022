package oop.FileHelpers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PlainFileWriters {
    public static void writeNameToFile(File file, String text) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(file, true);
            fw.write(text+"\n");

        } catch (IOException e) {
            System.out.println("Problem z obsługą pliku");
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    System.out.println("Problem z obsługą pliku");
                    e.printStackTrace();
                }
            }
//            Próba zamknięcia pliku również operuje na pliku, daltego również wymaga obsługi wyjątku
        }
    }

    public static void writeNameToFileBuffered(File file, String text){
//        BufferedWriter bw1 = new BufferedWriter(new FileWriter())
//        Sposób w jaki tworzylibyśmy instancję readera w 'klasyczny' sposób
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
//            Sposób odczytu z wykorzystaniem try-with-resource. Zaletą tej metody jest to, że nie musimy pamiętać o
//            zamykaniu pliku. Zasoby zostaną zwolnione zaraz po zakończeniu try...catch
            bw.write(text);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Operacja na pliku nie powiodla sie");
            e.printStackTrace();
        }
        //dopisz klauzulę finally do zapisu buforowanego
    }
}
