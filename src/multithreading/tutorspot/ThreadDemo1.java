package multithreading.tutorspot;

public class ThreadDemo1 implements Runnable{
    private Thread t = null;
    private String name;

    public ThreadDemo1(String name){
        this.name = name;
        System.out.println("Creating "+name);
    }

    @Override
    public void run(){
        System.out.println("Running "+name);
        try{
            for(int i = 4; i > 0; i--){
                System.out.println("Thread: "+this.name+", "+i);
                Thread.sleep(50);
            }
        }catch(InterruptedException ex){
            System.out.println("Thread: "+this.name+", interrupted. "+ex.getMessage());
        }

        System.out.println("Thread: "+this.name+" existing");
    }

    public void start(){
        System.out.println("Starting "+this.name);
        if (t == null){
            t = new Thread(this, this.name);
            t.start();
        }
    }

    public static void main(String[] args){
        ThreadDemo1 t1 = new ThreadDemo1("thread-1");
        t1.start();

        ThreadDemo1 t2 = new ThreadDemo1("thread-2");
        t2.start();
    }
}