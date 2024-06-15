
public class ChildThreadPriority {
    
    public static void main(String[] args) {
      //  System.out.println("Hello, World!");
        MyThread t1 = new MyThread();
        t1.setPriority(7);
        t1.start()
        ;
        MyThread2 t2 = new MyThread2();
        t2.start()
        ;
        
        
    }
    
}
class MyThread extends Thread{
    public void printPriority(){
      System.out.println("parent :"+this.getPriority());  
    }
    public void run(){
        printPriority();
    }
}
class MyThread2 extends MyThread{
    public void printPriority(){
      System.out.println("child :"+this.getPriority());  
    }
    public void run(){
        printPriority();
    }
}