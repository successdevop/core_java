package oop.singleton;

public class ClassicSingleton{
    private static ClassicSingleton instance = null;

    private ClassicSingleton(){}

    public static ClassicSingleton getInstance(){
        if (instance == null){
            instance = new ClassicSingleton();
        }
        return instance;
    }

    protected void demoMethod(){
        System.out.println("demoMethod() for singleton class");
    }
}