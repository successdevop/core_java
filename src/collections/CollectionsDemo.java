package collections;

import java.util.*;
import java.util.concurrent.ConcurrentMap;

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

class ListDemo{
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(0, 10);
        list1.add(1, 20);

        System.out.println("list 1: "+list1);

        list2.add(10);
        list2.add(20);
        list2.add(30);

        System.out.println("list 2: "+list2);

        list2.addAll(2,list1);

        System.out.println("List2 and list1 combine: "+list2);

        list1.remove(1);
        System.out.println("list1: "+list1);

        System.out.println(list2.get(1));

        list2.set(0, 1234567);
        System.out.println("list2: "+list2);
    }
}

class ListDemo2{
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<>();
        a1.add("Success");
        a1.add("345");
        a1.add("Faith");
        System.out.println(a1);
        a1.remove("Success");
        System.out.println(a1);

        List<String> a2 = new LinkedList<>();
        a2.add("Food");
        a2.add("Fish");
        a2.add("plantain");
        System.out.println(a2);
    }
}

class QueueDemo{
    public static void main(String[] args) {
        Queue<Integer> a1 = new PriorityQueue<>();
        a1.add(123);
        a1.add(6);
        a1.add(8);
        System.out.println(a1);
        int num = a1.remove();
        System.out.println("The element deleted from head is: "+num);
        System.out.println(a1);
        int head = a1.peek();
        System.out.println("The head of the queue is: "+head);
        int size = a1.size();
        System.out.println("size of the queue is: "+size);
    }
}

class MapDemo{
    public static void main(String[] args) {
        Map<String, String> m2 = new HashMap<>();
        m2.put("Success", "8");
        m2.put("Mahnaz", "31");
        m2.put("Ayan", "12");
        m2.put("Daisy", "14");

        Map<String, String> m1 = new HashMap<>();
        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");

        System.out.println(" Map Elements");
        System.out.print("\t" + m1);

//        m1.clear();

        System.out.println(m1.containsKey("Zara"));
        System.out.println(m1.containsValue("31"));
        System.out.println(m1.entrySet());
        System.out.println(m1.equals(m2));
        System.out.println(m1.get("Ayan"));
        System.out.println(m1.hashCode());
        System.out.println(m1.isEmpty());
        System.out.println(m1.keySet());
        System.out.println(m1.put("1", "home"));
        m1.putAll(m2);
        m1.remove("Ayan");
        System.out.println(m1.size());
        System.out.println(m1.values());
        System.out.println(m1.containsValue("2"));

        System.out.println("\nnew HashMap: "+m1);
    }
}

class SortedMapDemo{
    public static void main(String[] args) {
        SortedMap<String, Double> map = new TreeMap<>();
        map.put("Zara", 3434.34);
        map.put("Mahnaz", 123.22);
        map.put("Ayan", 1378.00);
        map.put("Daisy", 99.22);
        map.put("Qadir", -19.08);

        System.out.println(map);
        map.put("Qadir", 123009.43);
        System.out.println(map);
        map.remove("Qadir");
        System.out.println(map);
        System.out.println(map.comparator());
        System.out.println();

        Set<Map.Entry<String, Double>> entryset = map.entrySet();
        System.out.println(entryset);

        for (Map.Entry<String, Double> stringDoubleEntry : entryset) {
            stringDoubleEntry.setValue(stringDoubleEntry.getValue() * 10);
            System.out.println(stringDoubleEntry.getKey()+"\t\t"+stringDoubleEntry.getValue());
        }
    }
}

class SetDemo{
    public static void main(String[] args) {
        int[] numbers = {34, 22, 10, 60, 30, 22};
        Set<Integer> num = new HashSet<>();
        try{
            for (int number : numbers) {
                num.add(number);
            }
            System.out.println(num);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println();

        int[] numbers1 = {34, 22, 10, 60, 30, 22};
        Set<Integer> num1 = new TreeSet<>();
        try{
            for (int number : numbers1) {
                num1.add(number);
            }
            System.out.println(num1);
            System.out.println("First Element of Set: "+num1.stream().findFirst());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        for(Integer val : num){
            System.out.println(val);
        }
    }
}