package multithreading;

public class MemoryMonitoringDaemon implements Runnable{
    @Override
    public void run(){
        Runtime runtime = Runtime.getRuntime();

        while(true){

            try{
                long usedMemory = runtime.totalMemory() - runtime.freeMemory();
                System.out.println("Memory usage: "+usedMemory);
                Thread.sleep(5000);

            } catch (InterruptedException ex){
                System.out.println("Memory monitor interrupted");
            }
        }
    }
}