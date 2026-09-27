package oop.abstraction;

abstract class Vehicle{
    public void startEngine(){
        System.out.println("Engine started");
    }
}

class Car extends Vehicle{
    private String color;

    public Car(String color){
        this.color = color;
    }

    public void printDetails(){
        System.out.println("Car color: "+ this.color);
    }

    public static void main(String[] args){
        Car car = new Car("Red");

        System.out.println(car.color);
        car.printDetails();
        car.startEngine();
    }
}