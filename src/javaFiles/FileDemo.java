package javaFiles;

import java.io.File;
import java.util.Arrays;

public class FileDemo{
    public static void main(String[] args){
//        File myFile = new File("text.txt");
//        System.out.println(myFile.getName());
//        System.out.println(myFile.getAbsolutePath());
//        System.out.println(myFile.canRead());
//        System.out.println(myFile.canWrite());
//        System.out.println(myFile.exists());
//        System.out.println(myFile.isFile());
//        try{
//            System.out.println(myFile.createNewFile());
//        }catch(Exception e){
//            System.out.println("Caught exception");
//        }
//        System.out.println(myFile.delete());
//        System.out.println(Arrays.toString(myFile.list()));
//        System.out.println(myFile.mkdir());
//        System.out.println(myFile.delete());

        File f = null;
        String[] str = {"file1.txt", "file2.txt", "file3.txt"};

        try{
            for (String s : str){
                f = new File(s);

                boolean b = f.canExecute();

                String abs = f.getAbsolutePath();

                System.out.println(abs + " is executable: " + b);

            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}