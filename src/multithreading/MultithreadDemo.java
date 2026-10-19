package multithreading;

public class MultithreadDemo{
    public static class ChildThreadClass implements Runnable{
        @Override
        public void run(){
            count();
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " thread");
        Thread t = new Thread(new ChildThreadClass(), "child");
        t.start();

        count();
    }

    public static void count(){
        for (int i = 1; i <= 100; i++){
            System.out.println(Thread.currentThread().getName() + " "+i);
        }
    }
}

class ThreadPriority{
    public static class Thread1 implements Runnable{
        @Override
        public void run(){
            count();
        }
    }

    public static class Thread2 implements Runnable{
        @Override
        public void run(){
            count();
        }
    }

    public static class Thread3 implements Runnable{

        @Override
        public void run() {
            count();
        }
    }

    public static void count(){
        for (int i = 1; i <=100; i++){
            System.out.println(Thread.currentThread().getName() + " count: "+ i);
        }
    }

    public static void countWithSleep(int sleepTime){
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName+" start counting");

        for (int i = 1; i <= 50; i++){
            System.out.println(threadName+" count: "+i);
            try{
                Thread.sleep(sleepTime);
            } catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(()-> countWithSleep(1), "High-Priority");
        Thread t2 = new Thread(()-> countWithSleep(0), "Low-Priority");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();

//        Thread t1 = new Thread(new Thread1(), "Thread-1");
//        Thread t2 = new Thread(new Thread2(), "Thread-2");
//        Thread t3 = new Thread(new Thread3(), "Thread-3");
//
//        t1.setPriority(Thread.MAX_PRIORITY);
//        t2.setPriority(Thread.NORM_PRIORITY);
//        t3.setPriority(Thread.MIN_PRIORITY);
//
//        t1.start();
//        t2.start();
//        t3.start();
    }
}