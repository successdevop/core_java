package collections;

import java.util.*;

public class CollectionsDemo{
    public static void main(String[] args){
        List a1 = new ArrayList<>();
        a1.add("Zara");
        a1.add("Ayan");
        a1.add(2);
        a1.add(5);
        a1.add(true);

        System.out.println(a1);

        List b1 = new LinkedList<>();
        b1.add("Mahnaz");
        b1.add(2);
        b1.add(true);
        System.out.println(b1);


        Set c1 = new HashSet<>();
        c1.add("Success");
        c1.add(356);
        c1.add(true);
        c1.add(21.453);
        System.out.println(c1);

        Map m1 = new HashMap<>();
        m1.put(1, "goat");
        m1.put(true, 20.33);
        m1.put("hi", "chick");
        System.out.println(m1);
    }
}