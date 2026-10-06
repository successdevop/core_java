package javaFiles;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class CreateFileDemo{
    public static void main(String[] args){
        System.out.println("Create file with FILE OUPUT_STREAM");
        try{
            byte[] bWrite = {65, 66, 67, 68, 69, 70};

            OutputStream ops = new FileOutputStream("test.txt");

            for (int i = 0; i < bWrite.length; i++){
                ops.write(bWrite[i]);
            }
            ops.close();

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();
            System.out.println(size);

            for(int i = 0; i < size; i++){
                System.out.print((char) is.read() + " ");
            }
            is.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

class FileMethodDemo{
    public static void main(String[] args) {
        System.out.println("Create file with File.createNewFile() method");

        try{
            File f = new File("text.txt");

            if (f.createNewFile()){
                System.out.println("Created new file!");
            }else{
                System.out.println("File already exists.");
            }

            FileWriter writer = new FileWriter(f);
            writer.write("Test data");
            writer.close();

            FileReader fr = new FileReader(f);

            int c;
            while((c = fr.read()) != -1){
                char ch = (char) c;
                System.out.print(ch + " ");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

class FileWriteMethodDemo{
    public static void main(String[] args){
        String data = "Test Data";
        try{
            Files.write(Paths.get("log.txt"), data.getBytes());

            List<String> lines = Arrays.asList("ist line", "second line");
            Files.write(Paths.get("file6.txt"), lines, StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);

            List<String> log = Files.readAllLines(Paths.get("log.txt"));
            System.out.println(log);

            List<String> file6 = Files.readAllLines(Paths.get("file6.txt"));
            System.out.println(file6);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}