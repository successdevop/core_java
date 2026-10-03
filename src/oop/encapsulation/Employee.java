package oop.encapsulation;

public class Employee{
    private String emp_name;
    private String emp_id;
    private double net_salary;

    public Employee(String name, String id, double salary){
        this.emp_name = name;
        this.emp_id = id;
        this.net_salary = salary;
    }

    public String getEmpName(){
        return this.emp_name;
    }

    public String getEmpId(){
        return this.emp_id;
    }

    public double getEmpNetSalary(){
        return this.net_salary;
    }

    public void setEmpName(String name){
        this.emp_name = name;
    }

    public void setEmpId(String id){
        this.emp_id = id;
    }

    public void setEmpNetSalary(double salary){
        this.net_salary = salary;
    }
}