package oop.nestedclasses;

public abstract class Annonymous{
    public abstract void myMethod();

    public void displayMessage(Message m){
        System.out.println(m.greet() + " This is an example of annonymous inner class as an argument");
    }
}

interface Message{
    String greet();
}