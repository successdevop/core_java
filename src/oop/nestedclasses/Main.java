package oop.nestedclasses;

public class Main{
    public static void main(String[] args){
        OuterDemo otd = new OuterDemo();

        OuterDemo.InnerDemo inn = otd.new InnerDemo();
        inn.getNum();

        Annonymous ann = new Annonymous(){
            public void myMethod(){
                System.out.println("This is an example of an annonymous inner class");
            }
        };
        ann.myMethod();

        ann.displayMessage(() -> "Hello world\n");
        System.out.println();

        StaticNestedClassDemo.Inner sinn = new StaticNestedClassDemo.Inner();
        sinn.myMethod();
    }
}