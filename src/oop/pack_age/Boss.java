package oop.pack_age;
import oop.encapsulation.Employee;

public class Boss{
    public void payEmployee(Employee e){
        System.out.println(e.getEmpNetSalary());
    }

    public static void main(String[] args){
        Employee emp = new Employee("Success", "EMP001", 1_000_000);
        Boss boss = new Boss();
        boss.payEmployee(emp);
    }
}