package oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class App {
    public static void main(String[] args) {
        /*
            PRZED URUCHOMIENIEM KLASY ZAIMPLEMENTUJ KONSTRUKTORY Z PARAMETREM!!
         */

        Dog dog1 = new Dog("Azor");
        Dog dog2 = new Dog("Szarik");
        Cat cat1 = new Cat("Mruczek");
        Dog dog3 = new Dog("Scooby");
        Cat cat2 = new Cat("Garfield");

        Animal[] animals = new Animal[5];
        animals[0] = dog1;
        animals[1] = dog2;
        animals[2] = cat1;
        animals[3] = dog3;
        animals[4] = cat2;
        //Przenieś tworzenie instancji obiektów poza tablicę

        animals[3].printInfo();

        List<Animal> animalList = new ArrayList<Animal>();
        animalList.add(dog1);
        animalList.add(dog2);
        animalList.add(cat1);
        System.out.println(animalList.toString());

        HashSet<String> animalsNames = new HashSet<String>();
        animalsNames.add(cat1.getName());
        animalsNames.add(dog1.getName());
        animalsNames.add("Mruczek");
        animalsNames.add(dog2.getName());
        animalsNames.add(dog1.getName());
        System.out.println(animalsNames.toString());

        HashMap<String, Animal> animalsMap= new HashMap<String, Animal>();
        animalsMap.put(cat1.getName(), cat1);
        animalsMap.put(dog1.getName(), dog1);
        System.out.println(animalsMap.toString());
        System.out.println(animalsMap.get("Mruczek").toString());


    }
}
