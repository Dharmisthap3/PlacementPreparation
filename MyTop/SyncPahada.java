
public class SyncPahada {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    
        Pahade one = new Pahade(2);
        one.start();
        Pahade two = new Pahade(5);
        two.start();
    }
  
}

class Pahade extends Thread{
    int n;
    Pahade(int n){
        this.n=n;
    }
    public void run(){
        try{
    for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        sleep(400);
        }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}