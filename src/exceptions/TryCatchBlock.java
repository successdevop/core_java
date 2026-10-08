package exceptions;

public class TryCatchBlock{
    public static void main(String[] args){
        int[] a = new int[2];
        int b = 0;
        int c = 1/b;

        try{
            System.out.println("Access element three: "+a[3]);
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("ArrayIndexOutOfBoundsException thrown: "+ ex);
        } catch (Exception e){
            System.out.println("Exception thrown: "+e);
        }
    }
}

class TryCatchBlock1{
    public static void main(String[] args) {
        int[] a = new int[2];
        int b = 0;

        try{
            int c = 1/b;
            System.out.println("Access element three: "+a[3]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Exception thrown: "+e);
        }
    }
}