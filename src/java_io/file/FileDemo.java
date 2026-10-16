package java_io.file;

import java.io.File;

public class FileDemo{
    public static void main(String[] args) {
        File f = null;
        String[] strs = {"test1.txt", "test2.txt"};

        try{
            for (String file : strs){
                f = new File(file);
                boolean bool = f.canExecute();

                String a = f.getAbsolutePath();
                System.out.print("Absolute path: "+a);

                System.out.println(" is executable: "+bool);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

//        File f = null;
//        String[] strs = {"test1.txt", "test2.txt"};
//        try {
//            // for each string in string array
//            for(String s:strs ) {
//                // create new file
//                f = new File(s);
//
//                // true if the file is executable
//                boolean bool = f.canExecute();
//
//                // find the absolute path
//                String a = f.getAbsolutePath();
//
//                // prints absolute path
//                System.out.print(a);
//
//                // prints
//                System.out.println(" is executable: "+ bool);
//            }
//        } catch (Exception e) {
//            // if any I/O error occurs
//            e.printStackTrace();
//        }
    }
}

class FileDemo2{
    public static void main(String[] args) {
        File f = null;
        try{
            f = new File("resources.txt");

            boolean bool = f.canRead();

            String a = f.getAbsolutePath();

            System.out.print(a);
            System.out.println(" is readable: "+bool);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}