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

class FinallyTest{
    public static void main(String[] args) {
        int[] arr = new int[2];
        try{
            System.out.println("Accessing element three: "+arr[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown: "+e);
        }finally{
            arr[0] = 6;
            System.out.println("First element value: "+arr[0]);
            System.out.println("The finally statement is executed");
        }
    }
}

class FinallyTest2{
    public static void main(String[] args) {
        int[] arr = new int[3];
        try{
            System.out.println("Accessing element three: "+arr[3]);
        }catch(ArithmeticException e){
            System.out.println("Exception thrown: "+e);
        }finally{
            arr[0] = 6;
            System.out.println("First element value: "+arr[0]);
            System.out.println("The finally statement is executed");
        }
    }
}

class FinallyTest3{
    public static void main(String[] args) {
        System.out.println(returnFromMethod());
    }

    public static int returnFromMethod(){
        int[] arr = new int[1];
        try{
            return 3;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown: "+e);
        }finally{
            arr[0] = 6;
            System.out.println("First element value: "+arr[0]);
            System.out.println("The finally statement is executed");
        }
        return 0;
    }
}

class ThrowsDemo{
    public static void main(String[] args)throws Exception {
        int a = 3, b = 0;

        System.out.println("result: "+divide(a,b));

    }

    public static int divide(int a, int b) throws Exception{
        if(b == 0){
            throw new Exception("second argument cannot be zero");
        }

        return a/b;
    }
}