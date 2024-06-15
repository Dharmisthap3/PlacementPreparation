
public class single {
    
    public static void main(String[] args) {
       // System.out.println("Hello, World!");
        int[] a = {2,2,1,1,4};
        int result =0;
        for(int i=0;i<a.length;i++){
            result= result ^ a[i];
        }
        System.out.print(result+"    "+(2^2));
    }
    
}