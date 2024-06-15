
public class ThreadDemo {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Thread t1 = new MyThread("th1");
        t1.start();
        
        Thread t2 = new MyThread("th2");
        t2.start();
        
    }
    
}

class MyThread extends Thread{
    String name;
    MyThread(String name){
        this.name=name;
    }
   synchronized public void run(){
        try{
            for(int i=0;i<500;i++){
              System.out.println("du"+name);
            } 
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}