package oop;

public class Employee{
    String name;
    int age;
    String destination;
    double salary;

    public Employee(String name){
        this.name = name;
    }

    public void empAge(int empAge){
        age = empAge;
    }

    public void empDestination(String empDesig){
        destination = empDesig;
    }

    public void empSalary(double empSalary){
        salary = empSalary;
    }

    public void printDetails(){
        System.out.print("Employee details: ");
        System.out.print("name: "+this.name);
        System.out.print(", age: "+this.age);
        System.out.print(", destination: "+this.destination);
        System.out.println(", salary: "+this.salary);
    }

    public static void main(String[] args){
        Employee emp = new Employee("Success");
        emp.empAge(34);
        emp.empDestination("USA");
        emp.empSalary(120_000);
        emp.printDetails();
    }
}