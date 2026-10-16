package java_io.file.fileInputStream;

import java.io.*;

public class FileInputStreamDemo{
    public static void main(String[] args) {
        File file = new File("sync.txt");

        try(FileInputStream fis = new FileInputStream(file)){
            int size = fis.available();
            System.out.println("Bytes available to read: "+size);

        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}

class Demo2{
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("sync.txt");
            int readStream;
            while((readStream = fis.read()) != -1){
                char ch = (char) readStream;
                System.out.print(ch+"");
            }
            fis.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}

class Demo3{
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("sync.txt");
            FileDescriptor fds = fis.getFD();

            System.out.println("Is descriptor valid? : "+fds.valid());
            fis.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}

class Demo4{
    public static void main(String[] args) {

        try{
            FileOutputStream fos = new FileOutputStream("sync.txt");
            fos.write("Hello, we are testing fileoutputStream".getBytes());
            System.out.println("Data written successfully");
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

class FilePermissionDemo{
    public static void main(String[] args) {
        FilePermission fp = new FilePermission("sync.txt", "read, write");

        System.out.println(fp.getActions());
    }
}

class ReaderWriterDemo{
    public static void main(String[] args) {
        File file = new File("file_read_write.txt");
        try(FileWriter fw = new FileWriter(file);
        FileReader fr = new FileReader(file)){
            fw.write("This\n is\n an\n example\n");
            fw.flush();

            char[] c = new char[50];
            fr.read(c);

            for (char content : c){
                System.out.print(content);
            }

        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}

class FileWriterDemo{
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("example.txt");
            FileDescriptor fds = fos.getFD();

            FileWriter fw = new FileWriter(fds);
            fw.write("Hello world, FileWriter with FileDescriptor");

            fw.flush();
            fw.close();
            fos.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}