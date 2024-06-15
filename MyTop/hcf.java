import java.util.*;
public class hcf {
    
    public static void main(String[] args) {
        
      int n1,n2;
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1:");
        n1=sc.nextInt();
        System.out.println("Enter n2:");
        n2=sc.nextInt();
        int k=2,hcf1=1;
        while(k <= n1 && k <= n2){
            if(n1 % k == 0 && n2 % k == 0){
                hcf1=k;
                k++;
System.out.println("hcf is :"+hcf1);
            }
            
        }
        
        System.out.println("hcf is :"+hcf1);
    }
    
}