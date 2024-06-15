
public class multi {
    
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        
        int a = 5;
        int b = 0;
        int c;
        int[] arr = new int[2];
        arr[0]=1;
        arr[1]=2;
        try{
            int d= arr[26];
            c=a/b;
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException t){
            t.printStackTrace();
        }
        
    }
    
}