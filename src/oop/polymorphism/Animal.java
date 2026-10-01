package oop.polymorphism;

interface Vegetarian{}

public class Animal{
    public void move(){
        System.out.println("Animals can move");
    }
}

class Deer extends Animal implements Vegetarian{
    public void move(){
        System.out.println("Dogs can walk and run");
    }

    public void bark(){
        System.out.println("Dogs can bark");
    }

    public static void main(String[] args){
        Animal a = new Animal();
        Animal d = new Deer();

        a.move();
        d.move();
//        d.bark();
    }
}