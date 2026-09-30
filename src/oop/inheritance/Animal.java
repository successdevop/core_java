package oop.inheritance;

//public class Animal{}
public interface Animal{}

class Mammal implements Animal{}

//class Reptile extends Animal{}

class Dog extends Mammal{
    public static void main(String[] args){
//        Animal animal = new Animal();
        Mammal mammal = new Mammal();
        Dog dog = new Dog();

        System.out.println(mammal instanceof Animal);
        System.out.println(dog instanceof Mammal);
        System.out.println(dog instanceof Animal);

    }
}

class One1{
    public void printOne(){
        System.out.println("printOne() method of One class");
    }
}

class Main1 extends One1{
    public static void main(String[] args){
        Main1 main = new Main1();
        main.printOne();
    }
}