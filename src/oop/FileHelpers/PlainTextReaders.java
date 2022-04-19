package oop.FileHelpers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PlainTextReaders {
    public static String[] readNamesFromFile(File file){
        String lines = "";

        try(Scanner scan = new Scanner(file)){
            while(scan.hasNextLine()){
                lines += scan.nextLine() + "\n";
            }
//            Upewniamy się czy istnieje kolejna linia i dopiero wtedy odczytujemy (hasNextLine) aby uniknąć błędów
//            while(true){
//                lines += scan.nextLine() + "\n";
//            }
//            Jeśli linia jest niedostępna, a próbujemy ją odczytać pojawią się błędy
        } catch (FileNotFoundException e){
            System.out.println("Plik nie odnaleziony");
            System.out.println(e.getMessage());
        }
        return lines.split("\n");
    }
}
