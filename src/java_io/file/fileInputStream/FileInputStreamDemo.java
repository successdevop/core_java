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