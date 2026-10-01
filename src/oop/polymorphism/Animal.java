package oop.polymorphism;

interface Vegetarian{}

public class Animal{}

class Deer extends Animal implements Vegetarian{
    public static void main(String[] args){
        Deer d = new Deer();
        Animal a = d;
        Vegetarian v = d;
        Object o = d;

        System.out.println(d instanceof Deer);
        System.out.println(a instanceof Deer);
        System.out.println(v instanceof Deer);
        System.out.println(o instanceof Deer);
    }
}