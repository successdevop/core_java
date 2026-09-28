package oop.inheritance;

public class Super{
    int num = 20;
    int age;

    Super(int age){
        this.age = age;
    }

    public void getAge(){
        System.out.println("The value of the variable named age in super class is: " +age);
    }

    public void display(){
        System.out.println("This is the display method of superclass");
    }
}