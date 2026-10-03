package oop.inter_face;

public class MammalInt implements NameOfInterface{
    public void eat(){
        System.out.println("Mammals eat");
    }

    public void travel(){
        System.out.println("Mammals travel");
    }

    public int noOfLegs(){
        return 0;
    }

    public static void main(String[] args){
        MammalInt mammal = new MammalInt();
        mammal.eat();
        mammal.travel();
        System.out.println(mammal.noOfLegs());
    }
}