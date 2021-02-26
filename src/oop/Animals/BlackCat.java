package oop.Animals;

import oop.Exceptions.BlackCatException;

public final class BlackCat extends Cat {
    private static final String COLOR = "black";

    public BlackCat(String name) {
        if (!name.equals("Belzebub")){
            throw new BlackCatException(name);
        }
        this.setName(name);
        this.color = COLOR;
        //spróbuj zmienić wartość pola 'COLOR'
    }
}
