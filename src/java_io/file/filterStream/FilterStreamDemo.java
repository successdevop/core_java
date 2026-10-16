package java_io.file.filterStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class FilterStreamDemo {
    public static void main(String[] args) {
        try (FilterInputStream fis = new BufferedInputStream(new FileInputStream("example.txt"))) {
            System.out.println("Mark supported? " + fis.markSupported());

            // Read and print first character
            System.out.print((char) fis.read());

            // Mark the current position
            fis.mark(5); // Can read up to 5 bytes before the mark is invalid

            // Read next two characters
            System.out.print((char) fis.read());
            System.out.print((char) fis.read());

            // Reset back to marked position
            fis.reset();

            // Read again from the marked position
            System.out.print((char) fis.read());
            System.out.print((char) fis.read());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}