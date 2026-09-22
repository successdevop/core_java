//public class Employee{
//    public String name;
//    private double salary;
//
//    public Employee(String empName){
//        name = empName;
//    }
//
//    public void setSalary(double empSalary){
//        salary = empSalary;
//    }
//
//    public void printEmp(){
//        System.out.println("name: " + name);
//        System.out.println("salary: " + salary);
//    }
//
//    public static void main(String []args){
//        Employee emp = new Employee("Success");
//        emp.setSalary(1000.00);
//        emp.printEmp();
//    }
//}

public class Employee{
    private static double salary;

    public static final String DEPARTMENT = "Development";

    public static void main(String []args){
        salary = 1000.00;

        System.out.println(DEPARTMENT + " average salary: " + salary);
    }
}