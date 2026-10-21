package exceptions;

import java.io.*;

public class TryWithResourcesDemo{
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("example.txt")){
            char[] a = new char[50];
            fr.read(a);
            for (char c:a){
                System.out.print(c+"");
            }
        }catch(IOException ex){
            ex.getStackTrace();
        }

        try(
                FileReader fr = new FileReader("example.txt");
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter("example1.txt");
                BufferedWriter bw = new BufferedWriter(fw)
                ){

            String line;
            while((line = br.readLine()) != null){
                System.out.println("\n"+line);
                bw.write(line);
            }

        }catch(IOException e){
            e.getStackTrace();
        }
    }
}

class MultipleBlocksDemo{
    public static void main(String[] args) {
        try{
            int[] a = new int[2];
            int b = 0;
            int c = b/1;

            System.out.println("Accessing the third element: "+a[3]);
        } catch(ArithmeticException e){
            System.out.println("Arithmetic Exception: "+e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds Exception: "+e.getMessage());
        }catch(Exception e){
            System.out.println("Exception thrown: "+e.getMessage());
        }
        System.out.println("Out of block");
    }
}