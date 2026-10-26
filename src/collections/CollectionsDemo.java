package collections;

import java.util.*;

public class CollectionsDemo{
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<>();
        a1.add(0, "Peter");
        a1.add("Success");
        a1.add("Ayan");
        System.out.println(a1);

        List<String> lkd = new LinkedList<>();
        lkd.add("Zara");
        lkd.add("Favour");
        lkd.add("Faith");
        System.out.println(lkd);

        Set<Object> hSet = new HashSet<>();
        hSet.add("Computers");
        hSet.add("Monitor");
        System.out.println(hSet.isEmpty());
        System.out.println(hSet.contains("Success"));
        System.out.println(hSet);

        HashMap<String, String> mp = new HashMap<>();
        mp.put("1", "Orange");
        mp.put("2", "Apple");

        System.out.println(mp);

    }
}