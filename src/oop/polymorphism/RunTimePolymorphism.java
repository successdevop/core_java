package oop.polymorphism;

public class RunTimePolymorphism{
    public void displayInfo(){
        System.out.println("Some vehicles are there.");
    }
}

class Car extends RunTimePolymorphism{
    @Override
    public void displayInfo(){
        System.out.println("I have a car");
    }
}

class Bike extends RunTimePolymorphism{
    @Override
    public void displayInfo(){
        System.out.println("I have a bike");
    }
}

class Test{
    public static void main(String[] args){
        RunTimePolymorphism rtp = new Car();
        RunTimePolymorphism rtp2 = new Bike();

        rtp.displayInfo();
        rtp2.displayInfo();

    }
}