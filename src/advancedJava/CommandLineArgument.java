package advancedJava;

import java.util.ArrayList;
import java.util.List;

public class CommandLineArgument{
    public static void main(String[] args) {
        CommandLineArgument cma = new CommandLineArgument();

        MathOperation subtraction = (int a, int b) -> a - b;
        System.out.println(subtraction.operation(12, 90));

        MathOperation addition = (int a, int b) -> a + b;
        System.out.println(addition.operation(5, 90));

        MathOperation multiplication = (int a, int b) -> a * b;

        MathOperation division = (int a, int b) -> a/b;

        System.out.println(cma.operate(10, 5, addition));
        System.out.println(cma.operate(10, 5, subtraction));
        System.out.println(cma.operate(10, 5, multiplication));
        System.out.println(cma.operate(10, 5, division));

        GreetingService message = System.out::println;
        GreetingService message2 = msg2 -> System.out.println(msg2);

        message.sayMessage("Hello Faith");
        message2.sayMessage("Hello Success");
        System.out.println();

        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("html");
        list.add("python");

        list.forEach(i -> System.out.println(i));
        System.out.println();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        System.out.println(numbers);

        numbers.removeIf(num -> num % 2 == 0);
        numbers.replaceAll(i -> i * 2);
        System.out.println();
        System.out.println(numbers);
    }

    interface MathOperation{
        int operation(int a, int b);
    }

    interface GreetingService{
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
