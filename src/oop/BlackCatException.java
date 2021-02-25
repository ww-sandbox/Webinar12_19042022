package oop;

public class BlackCatException extends RuntimeException {
    private String chosenName;

    BlackCatException(String name){
        chosenName = name;
    }

    public String getChosenName(){
        return chosenName;
    }
}
