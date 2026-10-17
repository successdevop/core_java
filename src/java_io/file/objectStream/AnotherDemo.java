package java_io.file.objectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class AnotherDemo extends ObjectOutputStream {
    public AnotherDemo(OutputStream out) throws IOException {
        super(out);
    }

    public static void main(String[] args){
        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("drain.ser"))){
            ous.writeObject("First Object");
            System.out.println("First Object written successfully");


            ous.writeObject("Second Object");
            System.out.println("Second object written");
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
