package built_in_C;

import java.util.Arrays;

public class ArrayDemoClass{
    public static void main(String[] args){
        int[] intVals = new int[10];

        double[] myList = {1.9, 2.9, 3.4, 3.5};
        for (int i = 0; i < myList.length; i++){
            System.out.println("At index "+i+" is : "+myList[i]);
        }

        System.out.println();
        for(double vals : myList){
            System.out.println(vals);
        }

        double total = 0;
        for (int i = 0; i < myList.length; i++){
            total += myList[i];
        }
        System.out.println("Total: "+total);

        for (double vals : myList){
            total += vals;
        }
        System.out.println("Each total : "+total);

        double h_val = myList[0];
        for (int i = 0; i < myList.length; i++){
            if (h_val < myList[i]){
                h_val = myList[i];
            }
        }
        System.out.println("Highest value: "+h_val);
        System.out.println();
        pointArray(myList);
        System.out.println();
        System.out.println(Arrays.toString(reverse(new int[]{12,34,5,6,78,90,94,32,15,47,21})));
        Arrays.stream(myList).forEach(System.out::println);
    }

    public static void pointArray(double[] array){
        for (double v : array) {
            System.out.print(v + ", ");
        }
    }

    public static int[] reverse(int[] array){
        int[] myArray = new int[array.length];

        for(int i = 0; i < array.length; i++){
            myArray[i] = array[i];
        }

        return myArray;
    }
}