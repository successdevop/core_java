package collections;

import java.util.BitSet;
import java.util.Enumeration;
import java.util.Vector;

public class DataStructures{
    public static void main(String[] args) {
        Enumeration<String> days;
        Vector<String> vct = new Vector<>();

        vct.add("Sunday");
        vct.add("Monday");
        vct.add("Tuesday");
        vct.add("Wednesday");
        vct.add("Thursday");
        vct.add("Friday");
        vct.add("Saturday");

        days = vct.elements();
        System.out.println(days);
        while(days.hasMoreElements()){
            System.out.println(days.nextElement());
        }
    }
}

class BitsDemo{
    public static void main(String[] args) {
        BitSet bs = new BitSet(16);
        BitSet bs2 = new BitSet(16);

        for(int i = 0; i < bs.length(); i++){
            if ((i % 2) == 0){
                bs.set(i);
            }
            if ((i % 5) != 0){
                bs2.set(i);
            }
        }

        System.out.println("Initial pattern in bs: ");
        System.out.println(bs);
        System.out.println("Initial pattern in bs2: ");
        System.out.println(bs2);

        bs2.and(bs);
        System.out.println("Bs and Bs2: "+bs2);
    }
}

class VectorDemo{
    public static void main(String[] args) {
        Vector<String> vc = new Vector<>(3);
        System.out.println("Initial size: "+vc.size());
        System.out.println("Initial capacity: "+vc.capacity());

        vc.addElement("fruit");
        vc.addElement("love");
        vc.addElement("faith");
        vc.addElement("success");
        vc.addElement("success");
        vc.addElement("success");
        vc.addElement("success");
        vc.addElement("success");
        vc.addElement("success");
        vc.addElement("success");
        vc.addElement("success");
        vc.addElement("success");
        vc.addElement("success");
        vc.addElement("success");
        vc.addElement("success");
        vc.addElement("success");
        vc.addElement("success");
        vc.addElement("success");
        vc.addElement("success");
        vc.addElement("success");
        System.out.println("Capacity after four additions: " + vc.capacity());

    }
}