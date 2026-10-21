package exceptions;

import java.util.concurrent.ExecutionException;

public class ExceptionPropagation{
    public static void main(String[] args) throws NoSuchMethodException {
        ExceptionPropagation ep = new ExceptionPropagation();
        ep.getName();
//        try{
//            int b = 0;
//            int c = 1/b;
//            System.out.println("value: "+c);
//        } catch(Exception e){
//            e.printStackTrace();
//        }
    }

    public String getName() throws NoSuchMethodException{
        throw new NoSuchMethodException();
    }
}