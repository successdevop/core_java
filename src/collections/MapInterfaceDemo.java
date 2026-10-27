package collections;

import java.util.*;

public class MapInterfaceDemo{
    public static void main(String[] args) {
        Map<String, String> mp = new TreeMap<>();

        mp.put("Zara", "8");
        mp.put("Mahnaz", "31");
        mp.put("Ayan", "12");
        mp.put("Daisy", "14");

        System.out.println(mp.containsKey("Zara"));
        System.out.println(mp.containsValue("14"));
        System.out.println(mp);
        System.out.println(mp.entrySet());
        System.out.println(mp.equals("Zara"));
        System.out.println(mp.get("Ayan"));
        System.out.println(mp.hashCode());
        System.out.println(mp.isEmpty());
        System.out.println(mp.keySet());
        mp.put("lov", "is beautiful");
        System.out.println(mp.size());
        System.out.println(mp.values());
        mp.remove("lov");
        System.out.println(mp.values());
        mp.clear();
        System.out.println(mp);
        System.out.println(mp.containsKey("lov"));
        System.out.println(mp.containsValue("14"));
    }
}

class SortedMapDemo{
    public static void main(String[] args) {
        SortedMap<String, Double> sp = new TreeMap<>();

        sp.put("Zara", 34.57);
        sp.put("Mahnaz", 123.22);
        sp.put("Ayan", 1378.00);
        sp.put("Daisy", 99.22);
        sp.put("Qadir", -19.08);

        Set<Map.Entry<String, Double>> set = sp.entrySet();
        System.out.println(set);

        Iterator<Map.Entry<String, Double>> it = set.iterator();
        System.out.println(it);

        while(it.hasNext()){
            Map.Entry<String, Double> me = it.next();
            System.out.print(me.getKey()+": ");
            System.out.println(me.getValue());
        }

//        double dd = sp.get("Qadir");
//        System.out.println(sp.remove("Za"));
//        System.out.println(dd);
//        System.out.println(sp);
    }
}