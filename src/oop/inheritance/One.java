package oop.inheritance;

public class One{
    public void printOne(){
        System.out.println("printOne() method of One class");
    }
}

class Two extends One{
    public void printTwo(){
        System.out.println("printTwo() method of Two class");
    }
}

class Three extends One{
    public void printThree(){
        System.out.println("printThree() method of Three class");
    }
}

class Main {
    public static void main(String[] args){
        Two two = new Two();
        Three three = new Three();

        two.printOne();
        three.printOne();
    }
}