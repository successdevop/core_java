package oop;

import oop.static_classes.Outer;

public class Tester{
    int num = 10;

    Tester(){
        System.out.println("This is an example program on keyword this");
    }

    Tester(int num){
        this();

        this.num = num;
    }

    public void greet(){
        System.out.println("Welcome to Tutorialspoint");
    }

    public void print(){
        int num = 20;
        System.out.println("Value of local variable is "+num);

        System.out.println("Value of instance variable is "+this.num);

        this.greet();

    }

    static void fun(){
        System.out.println("fun: this is a static method");
    }

    public static int minFunction(int num1, int num2){
        int min;
        if (num1 > num2){
            min = num2;
        } else {
            min = num1;
        }

        return min;
    }

    public static double minFunction(double num1, double num2){
//        return Math.min(num1, num2);
        double min;
        if (num1 > num2){
            min = num2;
        } else {
            min = num1;
        }

        return min;
    }

    public static void main(String[] args){
//        int a = 20, b = 30;
//        double c = 25, d = 40;
//        Tester test = new Tester();
//
//        test.print();
//        System.out.println();
//
//        Tester test2 = new Tester(30);
//        test2.print();
//
//        fun();
//
//        System.out.println("int minimum value: "+minFunction(a, b));
//        System.out.println("double minimum value: "+minFunction(d, c));
        Outer.NestedDemo abc = new Outer.NestedDemo();
        abc.print();
    }
}