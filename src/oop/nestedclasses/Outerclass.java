package oop.nestedclasses;

public class Outerclass{
    public void myMethod(){
        int num = 23;

        class MethodInnerDemo{
            public void print(){
                System.out.println("This is method inner class "+num);
            }
        }

        MethodInnerDemo mid = new MethodInnerDemo();
        mid.print();
    }

    public static void main(String[] args){
        Outerclass oc = new Outerclass();
        oc.myMethod();
    }
}