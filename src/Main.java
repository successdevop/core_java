import oop.Dog;

public class Main{
    public static void main(String []args){
        System.out.println("Hello world");

        Dog dog = new Dog();
        dog.setBreed("Rotwailer");
        dog.setAge(2);
        dog.setColor("White");

        dog.printDetails();

        int result = new Main().minimum(34,41);
        System.out.println("result : "+result);
    }

    public int minimum(int num1, int num2){
        int min;
        if (num1 > num2)
            min = num2;
        else
            min = num1;

        return min;
    }
}