package ch03_object01;

public abstract class Human {
    String name;
    int hp;
    Human(String name,int hp){
        this.name = name;
        this.hp = hp;
    }
    abstract void action();
    abstract void die();
}
