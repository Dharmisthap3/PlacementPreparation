
public class ThreadSleep extends Thread{
   static int a =5;
    public static void main(String[] args) {
           for(int i= 5;i>=1;i--){
            try{
System.out.println(i+" ");
                Thread.sleep(500);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }
    
}