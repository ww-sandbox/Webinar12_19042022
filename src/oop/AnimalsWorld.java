package oop;

import oop.Animals.Animal;
import oop.Animals.BlackCat;
import oop.Animals.Cat;
import oop.Animals.Dog;
import oop.Exceptions.BlackCatException;
import oop.Exceptions.BlackCatSimpleException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class AnimalsWorld {
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

        printAnimalFromArray(animals, 3);

        BlackCat cat11 = createCat("Mruczek");
        System.out.println("Dziękuję za używanie programu");
    }
    public static void printAnimalFromArray(Animal[] animals, int index){
        int x=1;
        try {
            System.out.println("Zwierzę w tablicy animals pod indeksem " + index + " to " + animals[index]);
            x = 5/0;
//            Linijka wywołująca wyjątek typu ArithmeticException - dzielenie przez zero
        } catch(ArrayIndexOutOfBoundsException arrayException){
//            Tu możemy złapać dowolny wyjątek, a nawet tak ogólny jak Exception - jednak jest to o tyle niebezpieczne
//            że nie mamy (lub jest to trudno osiągalne) należytej kontroli nad działaniem aplikacji
            System.out.println("Sprawdź wybrany index. Powinien być w przedziale 0-" + (animals.length - 1));
//            System.out.println(arrayException.getMessage());
//            Jeśli w naszym wyjątku zdefiniowaliśmy dodatkowe metody, to możemy do nich się odwołać na tym etapie
            System.out.println(x);
        } catch (ArithmeticException ae){
//            Możemy definiować więcej klauzul 'catch' i obsługiwać kolejne wyjątki
            System.out.println("Nie możesz dzielić przez zero");
            System.out.println("Ustawiam x na wartość zero");
            x = 0;
//            Jeśli obsługiwalibyśmy tego typu wyjątek, warto byłoby kontrolować jaka wartość zostanie zapisana
//            w zmiennej, którą próbowaliśmy wyliczyć (zależnie od kontekstu)
        }
        finally {
            System.out.println("To jest koniec metody wyświetlającej zwierzaka");
//          Klauzula stosowana w specyficznych przypadkach. Wywoływana niezależnie od tego czy try zakończył się
//          poprawnie czy został rzucony wyjątek
        }
        System.out.println("A to już poza try");
    }

    public static BlackCat createCat(String name){
//        try {
//            return new BlackCat(name);
//        } catch (BlackCatSimpleException e) {
//            e.printStackTrace();
//        }
//        return null;
//        Zwracanie wartości null w miejscu, gdzie póbowaliśmy tworzyć obiekt jest dość niebezpieczne, trzeba to
//        obsłużyć na dalszych etapach, aby nie wystąpił NullPointerException
        try{
            return new BlackCat(name);
        } catch (BlackCatException bce){
            System.out.println("Nie udało się stworzyć czarnego kota. Wybrałeś niepoprawne imię " + bce.getChosenName());
            bce.printStackTrace();
        }
//        W tym wypadku mamy dostępną dodatkową metodę w naszym wyjątku i z niej korzystamy. Dodatkowo wyświetlamy
//        dalej Stacktrace aby umożliwić poszukiwanie błędu
        return null;

    }
}
