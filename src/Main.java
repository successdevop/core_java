import oop.Dog;
import oop.static_classes.Outer;

import static oop.Tester.minFunction;

public class Main{
    public static void main(String []args){
        new Outer.NestedDemo().print();
//        System.out.println("Hello world");
//
//        Dog dog = new Dog();
//        dog.setBreed("Rotwailer");
//        dog.setAge(2);
//        dog.setColor("White");
//
//        dog.printDetails();
//
//        int result = new Main().minimum(34,41);
//        System.out.println("result : "+result);
//
//        System.out.println(minFunction(30, 26));
//        int out = minFunction(11, 6);
//        System.out.println(out);
    }

    public int minimum(int num1, int num2){
        int min = 0;
        System.out.println(min);

        if (num1 > num2)
            min = num2;
        else
            min = num1;

        System.out.println(min);

        return min;
    }
}