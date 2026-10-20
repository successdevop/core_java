package multithreading.tutorspot;

public class ThreadDemo4 implements Runnable{
    private String name;
    private Thread t;

    ThreadDemo4(String name){
        this.name = name;
        System.out.println("Thread: "+name+", State: "+Thread.currentThread().getState());
    }

    @Override
    public void run() {
        System.out.println("Thread: "+name+", State: "+Thread.currentThread().getState());
        for (int i = 4; i > 0; i--){
            System.out.println("Thread "+name+", "+i);
        }

        System.out.println("Thread: "+name+", State: "+Thread.currentThread().getState());
    }

    public void starting(){
        if(t == null){
            t = new Thread(this, name);
            t.start();
            System.out.println("Thread: "+name+", State: "+Thread.currentThread().getState());
        }
    }
}

class DefaultNameDemo extends Thread{
    DefaultNameDemo(){
        System.out.println("Name: "+Thread.currentThread().getName());
    }

    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getName() + ", " + "State: Running");
        for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + Thread.currentThread().getName() + ", " + i);
        }
        System.out.println("Thread: " + Thread.currentThread().getName() + ", " + "State: Dead");
    }

    public void start () {
        System.out.println("Thread: " + Thread.currentThread().getName() + ", " + "State: Start");
        super.start();
    }
}

class Test2{
    public static void main(String[] args){
        DefaultNameDemo d1 = new DefaultNameDemo();
        DefaultNameDemo d2 = new DefaultNameDemo();
        DefaultNameDemo d3 = new DefaultNameDemo();
        d1.start();
        d2.start();
        d3.start();
//        ThreadDemo4 t1 = new ThreadDemo4("lifeCycleThread");
//        ThreadDemo4 t2 = new ThreadDemo4("lifeCycleThread2");
//        t1.starting();
//        t2.starting();
    }
}
