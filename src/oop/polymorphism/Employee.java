package oop.polymorphism;

public class Employee{
    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number){
        System.out.println("Constructing an employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public void mailCheck(){
        System.out.println("Mailing to check to "+this.name+" "+this.address);
    }

    public String toString(){
        return this.name+" "+this.address+" "+this.number;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public int getNumber(){
        return this.number;
    }
}