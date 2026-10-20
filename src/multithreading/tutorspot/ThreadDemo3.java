package multithreading.tutorspot;

public class ThreadDemo3 implements Runnable{

    private String message;

    public ThreadDemo3(String msg){
        this.message = msg;
    }

    @Override
    public void run() {
        while(true){
            System.out.println(message);
        }
    }
}

class GuessANumber extends Thread{
    private int number;

    public GuessANumber(int num){
        this.number = num;
    }

    @Override
    public void run(){
        int counter = 0;
        int guess = 0;

        do{
            guess = (int) (Math.random() * 100 + 1);
            System.out.println(getName()+" guesses "+guess);
            counter++;
        } while(guess != number);

        System.out.println("** Correct!!! "+getName()+" got it correctly in "+counter+" guesses. **");
    }
}

class Test1{
    public static void main(String[] args) throws InterruptedException{
        Runnable msg = new ThreadDemo3("write your message here");
        Thread t1 = new Thread(msg, "msg-thread");
        t1.setDaemon(true);
        System.out.println("Starting message thread...");
        t1.start();

        Thread t2 = new Thread(new ThreadDemo3("write goodbye message here"), "msg-thread-2");
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.setDaemon(true);
        System.out.println("Goodbye message thread...");
        t2.start();

        GuessANumber g1 = new GuessANumber(27);
        g1.start();

        g1.join();

        GuessANumber g2 = new GuessANumber(96);
        g2.start();

        System.out.println("main() is ending...");
    }
}