
public class ThreadPriority {
    
    public static void main(String[] args) {
        MyThread t1 = new MyThread()
        ;
        MyThread t2 = new MyThread()
        ;
        t1.start();
        t2.start();
        Thread.currentThread().setPriority(7);
        System.out.println(Thread.currentThread().getName());
        System.out.println("priority: "+Thread.currentThread().activeCount());
        
    }
    
}

class MyThread extends Thread{
    public void run(){
        
    }
}