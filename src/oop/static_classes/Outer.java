package oop.static_classes;

public class Outer{

    public static class NestedDemo{
        public void print(){
            System.out.println("This is my nested static class");
        }
    }

    public static void main(String[] args){
        new NestedDemo().print();
    }
}