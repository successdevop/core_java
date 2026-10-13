package java_io.bufferedStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class BufferedReaderDemo{
    public static void main(String[] args) {
        String input = "Hello, World!\nThis is a BufferedReader example.\nHave a nice day!";

        try(BufferedReader br = new BufferedReader(new StringReader(input))){
            System.out.println(br.readLine());

            br.mark(100);
            System.out.println(br.readLine());

            br.reset();
            System.out.println(br.readLine());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

class BufferedWriterDemo{
    public static void main(String[] args) {

    }
}