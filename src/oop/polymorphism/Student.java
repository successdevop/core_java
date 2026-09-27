package oop.polymorphism;

public class Student{
    String name;
    int rollNo;
    String section;

    Student(String name, int rollNo, String section){
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    public void printDetails(){
        System.out.print("Student details: ");
        System.out.println(this.name+", "+this.rollNo+", "+this.section);
    }

    public void printDetails(boolean hideSection){
        System.out.print("Student details: ");
        System.out.println(this.name+", "+this.rollNo+(hideSection ? "" : ", "+this.section));
    }

    public static void main(String[] args){
        Student std1 = new Student("Success", 1, "IX Blue");
        Student std2 = new Student("Faith", 2, "IX Red");
        Student std3 = new Student("Comfort", 3, "IX Yellow");

        std1.printDetails();
        std1.printDetails(true);

        std2.printDetails();
        std2.printDetails(true);

        std3.printDetails();
        std3.printDetails(true);
    }
}