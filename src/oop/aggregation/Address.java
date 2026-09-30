package oop.aggregation;

public class Address{
    int strNum;
    String city;
    String state;
    String country;

    Address(int strNum, String city, String state, String country){
        this.strNum = strNum;
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Student{
    int rno;
    String stdName;
    Address stdAddress;

    Student(int rno, String stdName, Address address){
        this.rno = rno;
        this.stdName = stdName;
        this.stdAddress = address;

    }
}

class Tester1{
    public static void main(String[] args){
        Address address = new Address(45, "Ikorodu", "Lagos", "Nigeria");

        Student std = new Student(123, "Success", address);
        System.out.println(std);
    }
}