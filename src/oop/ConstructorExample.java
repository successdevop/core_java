package oop;

public class ConstructorExample{
    String name;
    int age;

    ConstructorExample(){
        this.name = "Unknown";
        this.age = 0;
    }

    ConstructorExample(String name){
        this.name = name;
        this.age = 0;
    }

    ConstructorExample(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printDetails(){
        System.out.print("Student Details: name: ");
        System.out.println(this.name+", age: "+this.age);
    }

    public static void main(String[] args){
        ConstructorExample obj = new ConstructorExample("Success", 34);
        obj.printDetails();
        System.out.println();

        Logger log = new Logger();

    }
}

class Logger{
    private String format;

    private String getFormat(){
        return this.format;
    }

    private void setFormat(String format){
        this.format = format;
    }
}