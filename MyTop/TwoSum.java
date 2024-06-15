import java.util.*;
public class TwoSum{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        
        int[] arr = new int[n];
       System.out.println("Enter array elements:"); 
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target:");
        int target=sc.nextInt();
        for(int i=0;i<arr.length;i++){
           int val=target-arr[i];
            //System.out.println(arr[i]); 
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==val){
                    System.out.println("i : "+i+" j : "+j);
                }
            } 
        }
        
    }
}