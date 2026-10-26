package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListInterfaceDemo{
    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(0, 10);
        list1.add(1, 20);
        System.out.println("list1 :"+ list1);

        list2.add(10);
        list2.add(20);
        list2.add(30);

        list1.addAll(1, list2);
        System.out.println("list1: "+list1);
        System.out.println("list2 : " + list2);

//        list1.remove(1);
//        System.out.println("list 1 after removing an element: "+list1);
//
//        System.out.println("List 1 using the get() method: "+list1.get(2));
//
//        list1.set(0, 50);
//        System.out.println("List 1: "+list1);

        System.out.println(list1.subList(0,2));
    }
}