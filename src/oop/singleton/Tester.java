package oop.singleton;

public class Tester{
    public static void main(String[] args){
        System.out.println(Sington.getInstance());

        ClassicSingleton ston = ClassicSingleton.getInstance();
        ston.demoMethod();

        Integer x = 5;
        System.out.println(x);
        x = x + 10;
        System.out.println(x);

        Boolean y = true;
        y = false;
        System.out.println(y);
    }
}