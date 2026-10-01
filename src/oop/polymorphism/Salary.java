package oop.polymorphism;

public class Salary extends Employee{
    private double salary;

    public Salary(String name, String address, int number, double salary){
        super(name, address, number);
        setSalary(salary);
    }

    public void mailCheck(){
        System.out.println("Within mailCheck of Salary class ");
        System.out.println("Mailing check to "+getName()+" with salary "+this.salary);
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary){
        if (salary > 0.0){
            this.salary = salary;
        }
    }

    public double computePay(){
        System.out.println("Computing salary pay for "+getName());
        return this.salary / 52;
    }

    public static void main(String[] args){
        Salary s = new Salary("Success", "ikorodu, Lagos state, Nigeria", 123, 1_000_000);

        Employee e = new Salary("Faith", "yenegoa, bayelsa state, Nigeria", 234, 1_000_000);
        s.mailCheck();
        e.mailCheck();

        System.out.println(s.getSalary());
        System.out.println(s.computePay());
    }
}
