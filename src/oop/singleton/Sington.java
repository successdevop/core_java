package oop.singleton;

public class Sington{
    private static Sington singleton = new Sington();

    private Sington(){}

    public static synchronized Sington getInstance(){
        System.out.println("Singleton instance");
        return singleton;
    }

    protected void demoMethod(){
        System.out.println("demoMethod for singleton");
    }
}