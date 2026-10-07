package javaFiles;

import java.io.*;

public class IOStreamsDemo{
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("fis.txt");
            fos = new FileOutputStream("fos.txt");

            int c;
            while((c = fis.read()) != -1){
                fos.write(c);
            }
        }finally{
            if(fos != null){
                fos.close();
            }
            if(fis != null){
                fis.close();
            }
        }
    }
}

class FileWriterStream{
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;

        try{
            fr = new FileReader("file_reader.txt");
            fw = new FileWriter("file_writer.txt");

            int c;
            while((c = fr.read()) != -1){
                fw.write(c);
            }

            if (fr != null){
                fr.close();
            }

            if (fw != null){
                fw.close();
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}

class InputStreamReaderDemo{
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = null;

        try{
            isr = new InputStreamReader(System.in);
            System.out.println("Enter characters, \'q\' to quit: ");
            char c;
            do{
                c = (char) isr.read();
                System.out.println(c);
                System.out.println();
            }while(c != 'q');

        } finally{
            if(isr != null){
                isr.close();
            }
        }
    }
}

class FileStreamTest{
    public static void main(String[] args) {
        byte[] data = {65,66,67,68,69,70};
        try {
            OutputStream out = new FileOutputStream("output.txt");
            for (byte b : data){
                out.write(b);
            }
            out.close();

            // Read file
            InputStream in = new FileInputStream("output.txt");
            int size = in.available();

            for (int i = 0; i < size; i++){
                System.out.print((char)in.read()+" ");
            }
            in.close();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}