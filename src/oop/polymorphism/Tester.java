package oop.polymorphism;

public class Tester extends SuperTester{
    static int a;

    {
        a = 10;
        System.out.println("Inside Instance Initializer Block");
    }

    Tester(){
        System.out.println("Inside Constructor");
        a = 20;
    }

    public static void main(String[] args){
        Tester test = new Tester();
        System.out.println("Value of a : "+a);
    }
}