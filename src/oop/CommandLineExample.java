package oop;

public class CommandLineExample{
    public static void main(String[] args){
        for (int i = 0; i < args.length; i++){
            System.out.println("args["+i+"]: "+ args[i]);
        }

        printMax(34, 3, 3, 36, 2, 56.5);
        printMax(1,2,3,4,5);
    }

    public static void printMax(double... numbers){
        if (numbers.length == 0){
            System.out.println("No argument passed");
        }

        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > result){
                result = numbers[i];
            }
        }

        System.out.println("Max number is : "+result);
    }
}

class Main{
    int num1, num2;

    Main(){
        num1 = -1;
        num2 = -1;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.num1);
        System.out.println(obj.num2);
    }
}