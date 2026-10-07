package javaFiles;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileDemo{
    public static void main(String[] args) throws IOException {
        File f = new File("filename.txt");

        String name = f.getName();
        System.out.println(name);

        String absPath = f.getAbsolutePath();
        System.out.println(absPath);

        boolean b = f.canRead();
        System.out.println(b);

        f.createNewFile();

        boolean b1 = f.isFile();
        System.out.println(b1);

        long size = f.length();
        System.out.println(size);

        String[] arr = f.list();
        System.out.println(Arrays.toString(arr));

        File f2 = null;
        String[] strs = {"test1.txt", "test2.txt"};
        try{
            for (String s : strs){
                f2 = new File(s);

                boolean bool = f2.canExecute();

                String a = f2.getAbsolutePath();

                System.out.print(a + " ");

                System.out.println("is executable: "+ bool);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}