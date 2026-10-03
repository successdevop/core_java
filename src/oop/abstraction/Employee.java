package oop.abstraction;

public abstract class Employee{
    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number){
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public abstract double computePay();

    public void mailCheck(){
        System.out.println("Mailing a check to "+this.name+" "+this.address);
    }

    public String toString(){
        return this.name +" "+ this.address +" "+ this.number;
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

    public int getNumbers(){
        return this.number;
    }
}