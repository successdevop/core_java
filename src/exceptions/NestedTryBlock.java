package exceptions;

public class NestedTryBlock{
    public static void main(String[] args){
        try{
            int[] intArr = new int[2];

            try{
                int b = 0;
                int c = 1/b;
            }catch(ArithmeticException ex){
                System.out.println("Arithmetic Exception thrown: "+ex.getMessage());
            }

            System.out.println("Accessing element three: "+intArr[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Exception thrown: "+e.getMessage());
        }catch(Exception e){
            System.out.println("Exception thrown: "+e);
        }

        System.out.println("Out of try-block");
    }
}

class NestedTryBlock1{
    public static void main(String[] args) {
        try{
            int[] arr = new int[2];

            try{
                int b = 0;
                int c = 1/b;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array Exception thrown: "+e);
            }
            System.out.println("Accessing element three: "+arr[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Exception thrown: "+e);
        }
        System.out.println("Out of try-block");
    }
}