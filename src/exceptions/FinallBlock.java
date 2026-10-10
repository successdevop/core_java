package exceptions;

public class FinallBlock{
    public static void main(String[] args) {
        int[] a = new int[2];
        try{
            System.out.println("Accessing element three: "+a[3]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown: "+e);
        } finally {
            a[0] = 6;
            System.out.println("First element valus: "+a[0]);
            System.out.println("The finally statement is executed");
        }
    }
}

class FinallyDemo{
    public static void main(String[] args){
        int[] aa = new int[2];
        try{
            System.out.println("Accessing element three: "+aa[3]);
        } catch (ArithmeticException e){
            System.out.println("Exception thrown: "+e);
        } finally {
            aa[0] = 6;
            System.out.println("The finally statement is executed");
        }
    }
}

class FinallyReturnValueDemo{
    public static void main(String[] args) {
        System.out.println(testFinallyBlock());
    }

    public static int testFinallyBlock(){
        int[] a = new int[2];
        try{
            String num = "myName";
        } catch (Exception e){
            System.out.println("Exception thrown: "+e);
        } finally{
            a[0] = 6;
            System.out.println("The first element value is "+a[0]);
            System.out.println("The finally statement is executed");
        }
        return 0;
    }
}

class ThrowsDemo{
    public static void main(String[] args){
        int a = 10, b = 0;
        System.out.println(divide(a, b));
    }

    public static double divide(double a, double b){
        if (b == 0){
            throw new IllegalArgumentException("second argument cannot be zero");
        }

        return a /b;
    }
}