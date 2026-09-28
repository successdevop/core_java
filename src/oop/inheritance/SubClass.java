package oop.inheritance;

public class SubClass extends Super{
    int num = 10;

    SubClass(int age) {
        super(age);
    }

    public void display(){
        System.out.println("This is the display method of the subclass");
    }

    public void my_method(){
        SubClass sub = new SubClass(34);

        sub.getAge();

        sub.display();

        super.display();

        System.out.println("Value of a variable named num in sub class: "+sub.num);

        System.out.println("Value of a variable named num in super class: "+super.num);
    }

    public static void main(String[] args){
        SubClass sub = new SubClass(20);
        sub.my_method();
    }
}