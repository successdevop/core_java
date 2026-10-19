package multithreading;

import java.util.ArrayList;
import java.util.Random;

public class MemoryIntensiveTask implements Runnable{
    @Override
    public void run(){
        ArrayList<Integer> arr = new ArrayList<>();
        Random random = new Random();

        try{
            for (int i = 0; i < 100000; i++){
                arr.add(random.nextInt());
                if (i % 1000 == 0){
                    Thread.sleep(150);

                }
            }
        } catch(InterruptedException ex){
            System.out.println("Memory intensive task was interrupted");
        }

        System.out.println("Finished generating random numbers");
    }
}