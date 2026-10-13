package java_io.bufferedStreams;

import java.io.*;
import java.util.Arrays;

public class BufferedOutputStreamDemo{
    public static void main(String[] args) {
        String text = "Hello BufferedOutputStream";

        try(FileOutputStream fos = new FileOutputStream("resources.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos)){
            bos.write(text.getBytes());
            bos.flush();
            bos.close();
            System.out.println("Data written successfully");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

class BufferedOutputStreamDemo1{
    public static void main(String[] args) {
        byte[] data = "This is an example of chunked writing.".getBytes();
        System.out.println(Arrays.toString(data));

        try(
                FileOutputStream fos = new FileOutputStream("resources.txt");
                BufferedOutputStream bos = new BufferedOutputStream(fos)
        ){
            int chunkSize = 10;

            for(int i = 0; i < data.length; i += chunkSize){
                int length = Math.min(chunkSize, data.length - i);
                bos.write(data, i, length);
            }
            bos.flush();
            System.out.println("Chunked data written");
//        byte[] data = "This is an example of chunked writing.".getBytes();
//        // Create BufferedOutputStream and FileOutputStream to write content to a file
//        try (FileOutputStream fos = new FileOutputStream("resources.txt");
//             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
//            // define a chunk size
//            int chunkSize = 10;
//            for (int i = 0; i < data.length; i += chunkSize) {
//                // write content as per the chunk size
//                int length = Math.min(chunkSize, data.length - i);
//                bos.write(data, i, length);
//            }
//            // Ensures all data is written to the file
//            bos.flush();
//            System.out.println("Chunked data written successfully!");
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}

class BufferedOutputStreamDemo2{
    public static void main(String[] args) {
        try(
                FileInputStream fis = new FileInputStream("resources.txt");
                BufferedInputStream bis = new BufferedInputStream(fis);
                FileOutputStream fos = new FileOutputStream("resources2.txt");
                BufferedOutputStream bos = new BufferedOutputStream(fos)
        ){
            byte[] buffer = new byte[1024];
            int byteRead;

            while((byteRead = bis.read(buffer)) != -1){
                bos.write(buffer, 0, byteRead);
            }
            bos.flush();
            System.out.println("File content copied successfully");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}