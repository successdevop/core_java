package java_io.bufferedStreams;

import java.io.*;

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
        String content = "Hello world!\nThis is a BufferedWriter example";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("resources2.txt"))){
            bw.write(content);
            System.out.println("Content written successfully");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

class BufferedWriterDemo2{
    public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("resources2.txt"))){
            for (int i = 0; i <= 5; i++){
                bw.write("Line "+i+": This is a periodic flush example");
                bw.newLine();

                bw.flush();
                System.out.println("Flushed data after writing line: "+i);
            }
            System.out.println("Out of the loop");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}