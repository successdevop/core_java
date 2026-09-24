package operators;

public class Test{
    public static void main(String[] args){
        int a, b;
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println("The value of B is : "+ b);

        b = (a == 10) ? 20 : 30;
        System.out.println("The value of B is : "+ b);

        String name = "James";
        boolean result = name instanceof String;
        System.out.println(result);

        Vehicle car = new Vehicle();
        boolean output = car instanceof Vehicle;
        System.out.println(output);
    }
}

class Vehicle{}