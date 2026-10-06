package built_in_C;

import java.util.Arrays;

public class FinalArrayDemo{
    public static void main(String[] args){
        final int[] array = {1,2,3};
        System.out.println("Using direct initialization");
        for(int i = 0; i < 3; i++){
            System.out.println(array[i]);
        }

        System.out.println("Using Indexing");
        final String[] str = new String[3];
        str[0] = "mango";
        str[1] = "guava";
        str[2] = "pear";
        System.out.println(Arrays.toString(str));

        System.out.println("Using for loop");
        final double[] array3 = new double[3];
        for (int i = 0; i < 3; i++){
            array3[i] = (i + 1) * 1.5;
        }

        for(int j = 0; j < 3; j++){
            System.out.println(array3[j]+" ");
        }

        System.out.println("Modifying elements of a final array");
        final int[] myArr = {10, 20, 30};
        System.out.println("Array before modification: "+Arrays.toString(myArr));

        myArr[0] = 100;
        System.out.println("Array after modification: "+Arrays.toString(myArr));

        System.out.println("Reassigning a final array");
        int[] myArr1 = {10, 20, 30};
        int[] myArr2 = {1,2,3};
        System.out.println("Array before modification: "+Arrays.toString(myArr1));
        myArr1 = myArr2;
        System.out.println("Array after modification: "+Arrays.toString(myArr1));

    }
}