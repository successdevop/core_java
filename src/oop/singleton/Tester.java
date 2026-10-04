package oop.singleton;

public class Tester{
    public static void main(String[] args){
        System.out.println(Sington.getInstance());

        ClassicSingleton ston = ClassicSingleton.getInstance();
        ston.demoMethod();
    }
}