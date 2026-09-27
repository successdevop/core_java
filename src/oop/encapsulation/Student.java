package oop.encapsulation;

public class Student{
    private String name;
    private int rollNo;
    private String section;

    Student(String name, int rollNo, String section){
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    public void printDetails(){
        System.out.print("Student details: ");
        System.out.println(this.name+", "+this.rollNo+", "+this.section);
    }

    public static void main(String[] args){
        Student student = new Student("Success", 1, "IX Blue");

        System.out.println(student.name);
        System.out.println(student.rollNo);
        System.out.println(student.section);

        student.printDetails();
    }
}