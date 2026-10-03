package oop.abstraction;

public class AbstractDemo{
    public static void main(String[] args){
        Employee emp = new Salary("Faith", "Yenegoa, Bayelsa, Nigeria", 23456, 1_000_000);
        Salary emp1 = new Salary("Success", "Ikorodu, Lagos, Nigeria", 12345, 1_000_000);
        System.out.println(emp.computePay());
        System.out.println(emp1.computePay());

        emp.mailCheck();
        emp1.mailCheck();

        System.out.println(emp.toString());
        System.out.println(emp1.toString());
    }
}