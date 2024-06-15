import java.util.*;
public class gcdbymethod {
    
    public static void main(String[] args) {
        
       // System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1:");
        int n1= sc.nextInt();
        System.out.print("Enter n2:");
        int n2= sc.nextInt();
        int answer=gcd(n1,n2);
        System.out.println("gcd is "+answer);
    }
    
    public static int gcd(int a,int b){
        
        int k=1,res=0,i;
        while(k<=a && k<=b){
            if(a % k == 0 && b % k == 0){
                res=k;
            }
            k++;
        }
        return res;
    }
    
}