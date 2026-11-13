package dealership;

import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        String[] spareParts = new String[]{"tire", "windscreen", "brakes"};

        Car nissan = new Car("Nissan", 2000, 2020, "Green", spareParts);
        Car toyota = new Car("Toyota", 5000, 2023, "Blue", spareParts);

        System.out.println(nissan);
        System.out.println(toyota);

        spareParts[0] = "Engine";
        System.out.println(Arrays.toString(spareParts));

        System.out.println(nissan);
        System.out.println(toyota);

        Car jeep = new Car(nissan);
        System.out.println("JEEP");
        System.out.println(jeep);

        nissan.getSpareParts()[0] = "keys";
        nissan.setSpareParts(nissan.getSpareParts());
        System.out.println(nissan);




        System.out.println();
        Person person = new Person("Success", "Global citizen", "21-06-1992",
                new String[]{}, 234);
    }
}