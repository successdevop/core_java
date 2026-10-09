package exceptions;

public class NestedTryBlock{
    public static void main(String[] args) {
        try{
            int[] a = new int[2];

            try{
                int b = 0;
                int c = 1/b;
                System.out.println("C value: "+c);
            } catch (Exception ex){
                System.out.println("Child Exception thrown: "+ex);
            }

            System.out.println("Access element three: "+a[3]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Parent Exception thrown: "+e);
        }

        System.out.println("Out of block");
        int aa = 30, bb = 55;
        int result = aa + bb;
        System.out.println("Addition equals: "+result);
    }
}

class NestedDemo{
    public static void main(String[] args) {
        try{
            int[] a = new int[2];
            try{
                int b = 0;
                int c = 1/b;
                System.out.println(c);
            } catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Exception thrown in child class: "+ex);
            }
            System.out.println("Accessing element three: "+a[3]);
        } catch (Exception e){
            System.out.println("Exception thrown in parent class: "+e);;
        }
        System.out.println("Out of block");
    }
}

class ExceptTest1{
    public static void main(String[] args) {
        try{
            int[] a = new int[2];

            try{
                int b = 0;
                int c = 1/b;
                System.out.println("C value is: "+c);
            } catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Exception thrown in child class: "+ex);
            }
            System.out.println("Accessing element three: "+a[3]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception thrown in parent class: "+ex);
        }
    }
}