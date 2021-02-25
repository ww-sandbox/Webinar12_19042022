package oop;

public class Cat extends Animal implements Petable{
    public Cat(){
        System.out.println("Konstruktor kota");
    }

    public Cat(String name){
        super(name);
    }

    public Cat(String name, String color){
        super(name);
        this.color = color;
    }

    @Override
    public void useVoice(){
        System.out.println("Meeeeooowww");
    }

    @Override
    public String toString(){
        return "Kot | nazwa=" + this.getName();
    }

    @Override
    public void move() {
        System.out.println("Poruszam się zwinnie i delikatnie");
    }

    @Override
    public void pet() {
        System.out.println("Karm mnie i głaskaj, ale tylko gdy chcę");
    }
}
