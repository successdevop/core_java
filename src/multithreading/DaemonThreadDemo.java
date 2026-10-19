package multithreading;

public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread monitoringThread = new Thread(new MemoryMonitoringDaemon());
        monitoringThread.setDaemon(true);
        monitoringThread.start();

        Thread intensiveTask = new Thread(new MemoryIntensiveTask());
        intensiveTask.start();
    }
}