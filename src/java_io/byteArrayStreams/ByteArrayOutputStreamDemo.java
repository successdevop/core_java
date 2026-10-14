package java_io.byteArrayStreams;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayOutputStreamDemo{
    public static void main(String[] args) {
        try(ByteArrayOutputStream output = new ByteArrayOutputStream()){
            output.write("Java Programming".getBytes());
            System.out.println("Data in stream: "+output);
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Stream closed automatically by try-with-resources");
    }
}

class ByteArrayOutputStreamDemo2{
    public static void main(String[] args){
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try{
            bos.write("Hello, world!".getBytes());
            byte[] buffer = bos.toByteArray();
            System.out.println("Byte Array: "+ Arrays.toString(buffer));
            String content = new String(buffer);
            System.out.println("String content: "+content);
            bos.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}