package oop;

import oop.Animals.Animal;
import oop.Animals.BlackCat;
import oop.Animals.Cat;
import oop.Animals.Dog;
import oop.FileHelpers.PlainFileWriters;
import oop.FileHelpers.PlainTextReaders;

import java.io.*;
import java.util.Arrays;

public class SaveAnimals {
    public static void main(String[] args){
        Animal[] animals = new Animal[3];

        Dog dog1 = new Dog("Azor");
        Dog dog2 = new Dog("Szarik");
        Cat cat1 = new Cat("Mruczek");

        animals[0] = dog1;
        animals[1] = dog2;
        animals[2] = cat1;

        printName(animals, 2);
       // printName(animals,3);

        BlackCat bcat = new BlackCat("Belzebub");
        //zobacz co stanie się gdy przekażesz inne imię
        bcat.printInfo();

        writeNamesToFile(animals, "names");
        writeNamesToFileBuffered(animals, "names_buffered");

        File file = new File(System.getProperty("user.dir") + "/names.txt");
        String[] names2 = PlainTextReaders.readNamesFromFile(file);
        System.out.println(names2.length);
        System.out.println(names2[2]);
        System.out.println(Arrays.toString(names2));

    }
    public static void printName(Animal[] names, int index){
        System.out.println(names[index].getName());
        //stosując try...catch zabezpiecz metodę przed IndexOutOfBound exception
    }

    public static void writeNamesToFile(Animal[] animals, String filename){
        File file = new File(System.getProperty("user.dir") + "/" + filename + ".txt");
        for(Animal animal : animals){
            PlainFileWriters.writeNameToFile(file, animal.getName());
        }
    }

    public static void writeNamesToFileBuffered(Animal[] animals, String filename){
        File file = new File(System.getProperty("user.dir") + "/" + filename + ".txt");
        for(Animal animal : animals){
            PlainFileWriters.writeNameToFileBuffered(file, animal.getName());
        }
    }
}
