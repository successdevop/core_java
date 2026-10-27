package collections;

import java.util.*;

public class SetInterfaceDemo{
    public static void main(String[] args) {
        int[] count = {34, 22, 10, 60, 30, 22};

        Set<Integer> set = new LinkedHashSet<>();

        for(int i = 0; i < count.length; i++){
            set.add(count[i]);
        }
        System.out.println(set);

        TreeSet<Integer> sortedSet = new TreeSet<>(set);
        System.out.print("The sorted list is: ");
        System.out.println(sortedSet);

        System.out.println("The first element of the set is: "+ sortedSet.first());
        System.out.println("The last element of the set is: "+ sortedSet.last());
    }
}

class SortedSetDemo{
    public static void main(String[] args) {
        SortedSet<String> ss = new TreeSet<>();
        ss.add("b");
        ss.add("c");
        ss.add("a");

        System.out.println(ss);
        ss.remove("b");

        Iterator<String> it = ss.iterator();

        while(it.hasNext()){
            Object element = it.next();
            System.out.println(element);
        }
    }
}