package dataStructures;

import javax.swing.text.Element;
import java.util.*;

public class DataStructureDemo{
    public static void main(String[] args) {
        Enumeration<String> days;
        Vector<String> dayNames = new Vector<>();

        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        days = dayNames.elements();

        while (days.hasMoreElements()){
            System.out.println(days.nextElement());
        }
    }
}

class BitsDemo{
    public static void main(String[] args) {
        BitSet bits = new BitSet(16);
        BitSet bits2 = new BitSet(16);

        for(int i = 0; i < 16; i++){
            if(i % 2 == 0) bits.set(i);
            if(i % 5 != 0) bits2.set(i);
        }

        System.out.println("Initial pattern in bits: ");
        System.out.println(bits);
        System.out.println("Initial pattern in bits2: ");
        System.out.println(bits2);

        bits2.and(bits);
        System.out.println("nbits or bits");
        System.out.println(bits2);
    }
}

class VectorDemo{
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(3, 0);

        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        v.addElement(4);
        v.addElement(4);
        v.addElement(4);
        v.addElement(1);
        System.out.println(v);
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());

        System.out.println("initial size: "+v.size());
        System.out.println("initial capacity: "+v.capacity());

        if(v.contains(3)){
            System.out.println("YES");
        }else{
            System.out.println("No");
        }

        Enumeration<Integer> vEnums = v.elements();
        System.out.println(vEnums);

        while(vEnums.hasMoreElements()){
            System.out.print(vEnums.nextElement()+" ");
        }
    }
}

class stack{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println("Stack: "+st);
        showPush(st, 42);
        showPush(st, 66);
        showPush(st, 99);
        showPop(st);
        showPop(st);
        showPop(st);
        try{
            showPop(st);
        }catch(EmptyStackException ex){
            System.out.println("Empty stack: "+ex);
        }
    }

    public static void showPush(Stack st, int a){
        st.push(a);
        System.out.println("push("+a+")");
        System.out.println("stack: "+st);
    }

    public static void showPop(Stack st){
        System.out.println("pop-> ");
        Integer a = (Integer)st.pop();
        System.out.println(a);
        System.out.println("Stack: "+st);
    }
}

class DictionaryDemo{
    public static void main(String[] args) {
        Dictionary<Integer, Integer> dic = new Hashtable<>();
        dic.put(1, 1);
        dic.put(2, 2);

        Enumeration<Integer> enm = dic.keys();

        while (enm.hasMoreElements()){
            System.out.println(enm.nextElement());
        }
    }
}

class HashTableDemo{
    public static void main(String[] args) {
        Hashtable<Integer, Integer> hash = new Hashtable<>();
        hash.put(1, 1);
        hash.put(2, 1);
        hash.put(3, 3);

        System.out.println(hash.contains(0));
        System.out.println(hash.contains(3));

        System.out.println(hash.get(2));
    }
}