package multithreading;

import java.awt.image.BufferedImage;

public class GrayScaleConverterThread extends Thread{
    private BufferedImage image;
    private int startY;
    private int endY;

    public GrayScaleConverterThread(BufferedImage img, int startY, int endY){
        this.image = img;
        this.startY = startY;
        this.endY = endY;
    }

//    @Override
//    public void run(){
//        for (int y = 0; i < )
//    }
}