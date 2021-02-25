package oop;

public abstract class Animal {
    private String name;
    protected String color;
    //zmień modyfikator dostępu na private i sprawdź efekty w klasach dziedziczących
    //zmień modyfikator na domyślny i sprawdź klasę 'Fish'

    public Animal(){
        System.out.println("Konstruktor zwierzęcia");
    }

    public Animal(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Zwierzę | nazwa=" + name;
    }

    public void printInfo(){
        System.out.println("Cześć nazywam się " + name + "\nMój głos:");
        useVoice();
    }

    public abstract void useVoice();
    public abstract void move();
}
