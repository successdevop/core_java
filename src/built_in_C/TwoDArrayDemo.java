package built_in_C;

import java.util.Arrays;

public class TwoDArrayDemo{
    public static void main(String[] args){
        int[][] int_2DArray = {{1,2}, {3,4}, {5,6}, {7,8}, {9,10}, {11,12}, {13,14}};
        System.out.println("Using direct initialization");
        for(int i = 0; i < int_2DArray.length; i++){
            for (int j = 0; j < int_2DArray[i].length; j++){
                System.out.println(int_2DArray[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Using Indexing");
        String[][] string2DArray = new String[2][2];

        string2DArray[0][0] = "rice";
        string2DArray[0][1] = "beans";
        string2DArray[1][0] = "mango";
        string2DArray[1][1] = "guava";

        System.out.println(Arrays.deepToString(string2DArray));
        System.out.println();

        System.out.println("Using nested for loop");
        double[][] double2DArray = new double[2][2];
        for (int i = 0; i < double2DArray.length; i++){
            for (int j = 0; j < double2DArray[i].length; j++){
                double2DArray[i][j] = (i+1) * (j+1) * 1.5;
            }
        }

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                System.out.println(double2DArray[i][j]);
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(double2DArray));
    }
}