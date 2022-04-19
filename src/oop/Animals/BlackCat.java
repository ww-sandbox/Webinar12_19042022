package oop.Animals;

import oop.Exceptions.BlackCatException;
import oop.Exceptions.BlackCatSimpleException;

public final class BlackCat extends Cat {
    private static final String COLOR = "black";

    public BlackCat(String name) {
        if (!name.equals("Belzebub")){
            throw new BlackCatException(name);
        }
//        if (!name.equals("Belzebub")){
//            throw new BlackCatSimpleException();
//        }
//        BlackCatSimpleException jest wyjątkiem typu checked. Dlatego jeśli chcielibyśmy go rzucić w tym miejscu
//        Musimy go otoczyć try...catch lub dodać do sygnatury metody 'throws BlackCatSimpleException'
//        I obsłużyć wyjątek na dalszym etapie
        this.setName(name);
        this.color = COLOR;
        //spróbuj zmienić wartość pola 'COLOR'
    }
}
