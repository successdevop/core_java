package exceptions;

import java.io.FileNotFoundException;

public class Main{
    public static void main(String[] args) {
        try{
            int[] a = new int[2];
            int b = 0;
            int c = 1/b;
            System.out.println("Accessing third element: "+a[3]);
        }catch(ArrayIndexOutOfBoundsException | ArithmeticException ex){
            System.out.println("Exception thrown: "+ex);
        }

        try{
            int[] a = new int[2];
            int b = 0;
            int c = 1/b;
            System.out.println("Access element three: "+a[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("First Exception thrown: "+e);
        }catch(Exception e){
            System.out.println("Second Exception thrown: "+e);
        }

//        try{
//            int[] intArr = new int[2];
//            System.out.println("Access element three: "+intArr[3]);
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Exception thrown: "+e);
//        }
//        System.out.println("Out of block");
    }
}