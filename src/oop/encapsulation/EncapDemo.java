package oop.encapsulation;

public class EncapDemo{
    public static void main(String[] args){
        EncapTest encap = new EncapTest();
        encap.setName("Success");
        encap.setAge(34);
        encap.setIdNum("12345");

        System.out.println(encap.getName());
        System.out.println(encap.getAge());
        System.out.println(encap.getIdNum());

        System.out.println("Name: "+encap.getName()+", Age: "+encap.getAge()+", IdNum: "+encap.getIdNum());

        Person person = new Person();
        person.setName("Jonathan");
        person.setAge(25);
        System.out.println("Name: "+person.getName());
        System.out.println("Age: "+person.getAge());

        Employee emp = new Employee("Success", "EMP001", 1_000_000);

        System.out.println("Emp_name: "+emp.getEmpName());
        System.out.println("Emp_id: "+emp.getEmpId());
        System.out.println("Emp_net_salary: "+emp.getEmpNetSalary());
    }
}