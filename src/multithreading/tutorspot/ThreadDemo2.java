package multithreading.tutorspot;

public class ThreadDemo2 extends Thread{

    public ThreadDemo2(String name){
        super(name);
        System.out.println("Creating "+name);
    }

    @Override
    public void run(){
        System.out.println("Running "+getName());
        try{
            for (int i = 4; i > 0; i--){
                System.out.println("Thread: "+getName()+", "+i);
                Thread.sleep(50);
            }
        }catch(InterruptedException ex){
            System.out.println("Thread: "+getName()+" interrupted");
        }
        System.out.println("Thread: "+getName()+" existing");
    }
}

class Test{
    public static void main(String[] args) {
        ThreadDemo2 t1 = new ThreadDemo2("demo-1");
        ThreadDemo2 t2 = new ThreadDemo2("demo-2");

        t1.start();
        t2.start();
    }
}