import java.util.*;
public class sixoone {
    
    public static void main(String[] args) {
       // System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        int arrsize,i,max,count=0;
        
        System.out.println("Enter size of array");
        arrsize=sc.nextInt();
        int[] arr= new int[arrsize];
        System.out.println("Enter elements:");
        max=arr[0];
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
        }
        
        for(i=0;i<arrsize;i++){
            if(arr[i]==max){
                count++;
            }
        }
        System.out.println("The max is  "+max+" times "+count);
        
    }
    
}