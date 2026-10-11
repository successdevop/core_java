package java_io.byteArrayStreams;

import java.io.*;
import java.util.Arrays;

public class ByteArrayStreamTest{
    public static void main(String[] args) throws IOException {
        byte[] buf = {65,66,67,68,69};
        ByteArrayInputStream bais = null;

        try{
            bais = new ByteArrayInputStream(buf);
            int b = bais.available();
            for(int i = 0; i < b; i++){
                System.out.println((char)bais.read());
            }
//            int b = 0;

//            while((b = bais.read()) != -1){
//                char ch = (char) b;
//
//                System.out.println("byte is: "+b+"; char is: "+ch);
//            }

            System.out.println(bais.read()+" Reached the end");
        }catch(Exception e){
            System.out.println("Exception thrown: "+e);
        }finally{
            if (bais != null){
                bais.close();
            }
        }
    }
}

class BufferedOutputStreamDemo{
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream baos = null;
        BufferedOutputStream bos = null;
        try{
            baos = new ByteArrayOutputStream();
            bos = new BufferedOutputStream(baos);

            int b = 87;

            bos.write(b);

            bos.flush();

            byte[] bArr = baos.toByteArray();
            System.out.println(Arrays.toString(bArr));
        } catch (Exception e){
            e.printStackTrace();
        }finally{
            if (baos != null){
                baos.close();
            }

            if (bos != null){
                bos.close();
            }
        }
    }
}

class PrintDemo{
    public static void main(String[] args) {
        String s = "Hello my world";

        try{
            PrintWriter pw = new PrintWriter(System.out);
            pw.print(s);

            pw.println();
            pw.print("This is an example");
            pw.flush();

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}