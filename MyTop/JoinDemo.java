
public class JoinDemo {
    
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        Thhread a= new Thhread();
        Thhread b= new Thhread();
        Thhread c= new Thhread();
        a.setName("pujan");
        b.setName("harmi");
        c.setName("krina");
        
        a.start();
        try{
            a.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        b.start();
        c.start();
    }
    
}

class Thhread extends Thread{
    public void run(){
        for(int i=1;i<=59;i++){
            System.out.println(getName()+" : "+i);
        }
    }
}