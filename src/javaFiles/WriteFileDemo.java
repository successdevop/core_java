package javaFiles;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteFileDemo{
    public static void main(String[] args){
        String file_name = "/Users/raphtech/IdeaProjects/core_java/src/javaFiles/filedemo.txt";

        try{
            byte[] bWrites = {65, 66, 67, 68, 69, 70};
            File f = new File(file_name);
            OutputStream ops = new FileOutputStream(f);
            for (byte x : bWrites){
                ops.write(x);
            }
            ops.close();

            // Read File
            InputStream ips = new FileInputStream(file_name);
            int size = ips.available();

            for (int i = 0; i < size; i++){
                System.out.print((char) ips.read() + " ");
            }
            ips.close();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}

class FileWriterDemo{
    public static void main(String[] args) {
        String file_name = "/Users/raphtech/IdeaProjects/core_java/src/javaFiles/filewriterdemo.txt";

        try{
            FileWriter fw = new FileWriter(file_name);
            fw.write("Love is a beautiful thing, everyone should embrace love");
            fw.close();

            //Read files
            FileReader fr = new FileReader(file_name);
            int c;

            while((c = fr.read()) != -1){
                System.out.print((char) c + " ");
            }
            fr.close();

        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}

class File_Write{
    public static void main(String[] args) {
        String file_name = "/Users/raphtech/IdeaProjects/core_java/src/javaFiles/file_writer_demo.txt";
         String message = "I will make Nigeria and Africa great again";
         try{
            Files.write(Paths.get(file_name), message.getBytes());

            // read file
             String content = Files.readString(Paths.get(file_name));
             System.out.println(content);
         } catch (IOException e){
             throw new RuntimeException(e);
         }
    }
}