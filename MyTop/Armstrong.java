import java.util.*;
public class Armstrong {
    
    public static void main(String[] args) {
       // System.out.println("Hello, World!");
    Scanner sc = new Scanner(System.in);
        int a,count=0,sto,sto1;
        
      System.out.println("Enter a number: ");
      a=sc.nextInt();
        sto=a;
        sto1=sto;
        while(a!=0){
            a=a/10;
            count++;
        }  
        int i,rem=0,sum=0;
        int[] arr = new int[count];
//System.out.println(count); 
        for(i=0;i<arr.length;i++){
            rem=sto%10;
            sto=sto/10;
            arr[i]=(int)Math.pow(rem,count);
            sum=sum+arr[i];
            rem=0;
        }
        
        if(sum==sto1){
            System.out.println("Armstrong number:");
        }
        else{
                        System.out.println("not Armstrong number:");
        }
        
        
           
        
    }
    
}