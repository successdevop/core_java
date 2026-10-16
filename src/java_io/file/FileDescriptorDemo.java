package java_io.file;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;

public class FileDescriptorDemo{
    public static void main(String[] args) {
        File file = new File("sync.txt");

        try{
            FileOutputStream fos = new FileOutputStream(file);
            FileDescriptor fds = fos.getFD();

            fos.write("Hello, this is a test for sync method".getBytes());

            fds.sync();

            System.out.println("Data successfully written and synced to disc");
            fos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

class checkFileDescriptorDemo{
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("valid.txt")){
            FileDescriptor fds = fos.getFD();

            System.out.println("Is the file descriptor valid?: "+fds.valid());
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}