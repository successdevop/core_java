package oop;

public class Dog{
    String breed;
    int age;
    String color;

    public void setBreed(String breed){
        this.breed = breed;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void printDetails(){
        System.out.print("Dog details: ");
        System.out.println("name: "+this.breed+", age: "+this.age+", color: "+this.color);
    }

    public static void main(String[] args){
        Dog dog = new Dog();
        dog.setAge(20);
        dog.setBreed("German shephard");
        dog.setColor("White");
        dog.printDetails();
    }
}

class Puppy{
    int puppyAge;

    public Puppy(String name){
        System.out.println("Name chosen is : "+name);
    }

    Puppy(){
        this("Joy");
    }

    public void setAge(int age){
        this.puppyAge = age;
    }

    public int getAge(){
        System.out.println("Puppy's age is : "+this.puppyAge);
        return this.puppyAge;
    }

    public static void main(String[] args){
        Puppy puppy = new Puppy("nkita");
        puppy.setAge(5);
        puppy.getAge();
        System.out.println(puppy.puppyAge);
    }
}