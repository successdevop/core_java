package control_statements;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Loop{
    public static void main(String []args){
        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 1; i <= 5; i++){
            System.out.println("i is : "+ i);
        }
        System.out.println();

        for (int x = 10; x < 20; x = x + 1){
            System.out.println("value of x is: "+ x);
        }
        System.out.println();

        for (int x = 0; x < numbers.length; x++){
            System.out.print("x at index "+x+" is "+ numbers[x] +". The value of J is: ");
            for (int j = 1; j < 5; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 3; j++) {
                System.out.print(i + "," + j + " ");
            }
            System.out.println();
        }
        System.out.println();

        int num = 1;
        int i = 1;

        for (num = 1; num <= 10; num++){
            System.out.print("Table of "+num+" is : ");
            for (i = 1; i <= 10; i++){
                System.out.print(num * i + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int x = 0; x < 5; x = x + 1){
            System.out.println("Task executed "+ (x+1));
        }
        System.out.println();

        String[] fruits = {"Apple", "Banana", "Cherry"};

        for(String fruit: fruits){
            System.out.println(fruit);
        }
    }
}

class LoopTest{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        for (Integer num : numbers){
            System.out.println("num : "+ num);
        }

        List<String> names = Arrays.asList("James", "John", "Peter");

        for(String name : names)
            System.out.print(name+", ");
        System.out.println();

        List<Student> students = Arrays.asList(new Student(1, "Success"), new Student(2, "Faith"));

        for (Student student: students){
            System.out.print(student+", ");
        }
        System.out.println();

        Student[] students1 = { new Student(1, "Julie"), new Student(3, "Adam"), new Student(2, "Robert") };

        for( Student student : students1 ) {
            System.out.print( student );
            System.out.print(",");
        }
    }
}

class Student{
    int rollNo;
    String name;

    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Student(rollNo: "+this.rollNo+", name: "+this.name+")";
    }
}

class WhileLoopTest{
    public static void main(String[] args){
//        int x = 10;
//
//        while(x <= 20){
//            System.out.println(x);
//            x++;
//        }

        int[] numbers = {10, 20, 30, 40, 50};
        int xy = 0;
//
//        while(xy < numbers.length){
//            System.out.println(numbers[xy]);
//            xy++;
//        }
        int x = 10;

        do {
            System.out.println(x);
            x++;
        } while (x <= 20);
        System.out.println();

        do {
            System.out.println(numbers[xy]);
            xy++;
        } while (xy < numbers.length);
    }
}

class BreakTest{
    public static void main(String[] args) {
        int x = 0;

        while( true ){
            System.out.println("x : "+ x);
            x++;
            if (x == 15)
                break;
        }
        System.out.println();

        int[] numbers = {10, 20, 30, 40, 50};
        for (x = 0; x < numbers.length; x++){
            if (numbers[x] == 30)
                break;
            System.out.println("x : "+numbers[x]);
        }
        System.out.println();

        int day = 6;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}

class ContinueTest{
    public static void main(String[] args){
//        int x = 10;
//
//        while( x < 20 ){
//            x++;
//            if (x == 15)
//                continue;
//            System.out.println("x : "+ x);
//        }

//        int[] numbers = {10, 20, 30, 40, 50};
//        for (int y = 0; y < numbers.length; y++){
//            if (numbers[y] == 30){
//                continue;
//            }
//            System.out.println("x : "+ numbers[y]);
//        }
//        for (Integer x : numbers){
//            if (x == 30)
//                continue;
//            System.out.println("x : "+x);
//        }
//        int x = 10;
//        do {
//            x++;
//            if (x == 15){
//                continue;
//            }
//            System.out.println("x : "+x);
//        } while (x < 20);

//        for(int x = 0; x < 100; x = x+1){
//            if (x % 2 == 0){
//                continue;
//            }
//            System.out.println("x : "+x);
//        }
//        int x = 5;
//        Scanner sc = new Scanner(System.in);
//
//        while( x > 0 ){
//            System.out.println("Enter your favourite positive number: ");
//            int num = sc.nextInt();
//
//            x--;
//            if (num < 0){
//                continue;
//            }
//            System.out.println("num : "+num);
//        }

        for (int i = 1; i <= 3; i++){
            System.out.print("when i is : "+i+" j = ");
            for (int j = 1; j <= 3; j++){
                if (i == j){
                    continue;
                }
                System.out.print(j + ", ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == j) {
                    continue; // Skip when row index equals column index
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}