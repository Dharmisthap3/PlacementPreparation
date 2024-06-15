
public class ExtendThread {
    
    public static void main(String[] args) {
         MyThread t1 = new MyThread();
        Thread n1 = new Thread(t1);
        MyThread t2 = new MyThread();
        Thread n2 = new Thread(t2);
        MyThread t3 = new MyThread();
        Thread n3 = new Thread(t3);
       
        n1.start();
        n2.start();
        try{
            n1.sleep(10000);
            n1.join();
            n2.join();
            n3.join();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        MyThread a = new MyThread(); 
        a.print();
        System.out.println("Hello, World!");
       
    }
    
}

class MyThread implements Runnable{
    static int count=0;
    public void run(){
        for(int i=1;i<=50;i++){
            count++;
        }
    }
    public void print(){
        System.out.println(count);
    }
}