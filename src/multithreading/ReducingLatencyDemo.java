package multithreading;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ReducingLatencyDemo{
    public static void main(String[] args) {
        File inputFile = new File("src/demo.png");
        File outFile = new File("src/newImg.png");

        try{
            BufferedImage img = ImageIO.read(inputFile);
            long start = System.currentTimeMillis();
            convertToGrayScale(img);
            long end = System.currentTimeMillis();

            long timeTaken = end - start;
            System.out.println("Time taken: "+timeTaken+" milliseconds");

            ImageIO.write(img, "png", outFile);
        } catch (IOException e){
            System.out.println("Image processing error: "+e.getMessage());
        }
    }
}