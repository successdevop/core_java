package java_io.bufferedStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class BufferedInputStreamDemo{
    public static void main(String[] args) {
        FileInputStream fis = null;
        BufferedInputStream bis = null;

        try{
            fis = new FileInputStream("resources.txt");
            bis = new BufferedInputStream(fis);

            int byteArr;

            while((byteArr = bis.read()) != -1){
                System.out.print((char) byteArr+" ");
            }
            bis.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

class BufferedInputStreamDemo1{
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("resources.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            byte[] buffer = new byte[1024];

            int byteArr;
            while((byteArr = bis.read(buffer)) != -1){
                System.out.write(buffer, 0, byteArr);
            }
            System.out.println();
            System.out.println(Arrays.toString(buffer));
            bis.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

class BufferedInputStreamDemo2{
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("resources.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            bis.skip(10);
            int bytes;
            while((bytes = bis.read()) != -1){
                System.out.print((char) bytes+" ");
            }
            bis.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}