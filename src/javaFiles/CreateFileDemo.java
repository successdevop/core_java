package javaFiles;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class CreateFileDemo{
    public static void main(String[] args) {
        byte[] bArr = {11,21,3,40,5};
        try{
            OutputStream ops = new FileOutputStream("file1.txt");
            for (byte b : bArr) {
                ops.write(b);
            }
            ops.close();

            InputStream ips = new FileInputStream("file1.txt");
            int size = ips.available();

            for (int i = 0; i < size; i++){
                System.out.print((char)ips.read()+" ");
            }
            ips.close();

        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class FileMethodDemo{
    public static void main(String[] args){
        String file_name = "/Users/raphtech/IdeaProjects/core_java/src/javaFiles/file2.txt";
        File f = new File(file_name);

        try{
            if (f.createNewFile()){
                System.out.println("New File Created");
            }else {
                System.out.println("File already exists");
            }

            //Write to file
            FileWriter fw = new FileWriter(file_name);
            fw.write("This is a great privilege for me");
            fw.close();

            //Read from file
            FileReader fr = new FileReader(file_name);
            int c;

            while((c = fr.read()) != -1){
                char ch = (char) c;
                System.out.print(ch+" ");
            }
            fr.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

class FileWriteMethodDemo{
    public static void main(String[] args) {
        String file_name = "/Users/raphtech/IdeaProjects/core_java/src/javaFiles/file3.txt";
        String file_name2 = "/Users/raphtech/IdeaProjects/core_java/src/javaFiles/file4.txt";

        String data = "test the file writes method";

        try{
            Files.write(Paths.get(file_name), data.getBytes());

            List<String> str = Arrays.asList("ist line", "2nd line");
            Files.write(Paths.get(file_name2), str, StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);

            //read files
            List<String> content = Files.readAllLines(Paths.get(file_name));
            System.out.println(content);

            List<String> content2 = Files.readAllLines(Paths.get(file_name2));
            System.out.println(content2);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}