package oop.access_modifier;

public class Puppy{
    private int age;
    String name;

    public Puppy(){}

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public static void main(String[] arguments){
        Puppy puppy = new Puppy();
        puppy.age = 20;
//        puppy.setAge(43);

        puppy.name = "Bulldog";

        int age = puppy.getAge();
        System.out.println("Puppy age: "+age);

        System.out.println("Puppy name: "+puppy.name);
    }
}