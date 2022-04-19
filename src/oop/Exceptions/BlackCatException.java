package oop.Exceptions;

public class BlackCatException extends RuntimeException {
    private String chosenName;

    public BlackCatException(String name){
        chosenName = name;
    }

    public String getChosenName(){
        return chosenName;
    }
}
