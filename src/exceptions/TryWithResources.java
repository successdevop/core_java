package exceptions;

import java.io.*;

public class TryWithResources{
    public static void main(String[] args){
        int[] nums = {65,66,67,68,69,70};
        try(FileWriter fw = new FileWriter(new File("resources.txt"))){
            for (int i = 0; i < nums.length; i++){
                fw.write(nums[i]);
            }

            char[] ch = new char[nums.length];

            FileReader fr = new FileReader(new File("resources.txt"));
            fr.read(ch);

            for (char val : ch){
                System.out.println(val);
            }
            fr.close();

        } catch (IOException e){
            System.out.println("Exception thrown: "+e);
        }
    }
}

class TryWithMultipleResources{
    public static void main(String[] args) {
        try(
                FileReader file_reader = new FileReader("resources.txt");
                BufferedReader b_reader = new BufferedReader(file_reader);
                FileWriter f_writer = new FileWriter("try_res.txt");
                PrintWriter p_writer = new PrintWriter(f_writer);
                )
        {
            String line;
//            while((line = b_reader.readLine()) != -1){
//                p_writer.println(line);
//            }
        } catch (IOException ex){
            System.out.println("Thrown exception: "+ex);
        }
    }
}

class ReadData_Demo {
    public static void main(String args[]) {
        FileReader fr = null;
        try {
            File file = new File("resources.txt");
            fr = new FileReader(file); char [] a = new char[50];
            fr.read(a);   // reads the content to the array
            for(char c : a)
                System.out.print(c);   // prints the characters one by one
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}