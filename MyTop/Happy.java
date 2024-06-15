import java.util.*;
public class Happy {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        
        boolean isTrue = happy(n);
        if(isTrue){
            System.out.println("is happy");
        }
    }
    
    public static boolean happy(int n){
        int no_digit=0;
        int index=0;
        int a=n;
        int sum=0;
        while(n!=0){
            n=n/10;
            no_digit++;
        }
        List<Integer> li = new ArrayList<>();
        int[] arr = new int[no_digit];
        
        while(a!=0){
            arr[index] = a%10;
            a=a/10;
            index++;
        }
        for(int i=0;i<arr.length;i++){
            sum+=Math.pow(arr[i],2);
        }
        
        if(li.contains(sum)){
            System.out.print("not happy");
            return false;
        }
        li.add(sum);
       // System.out.println(sum);
        
        if(sum==1){
            System.out.println(sum);
            return true;
        }
        
        else{
            happy(sum);
        }
        return false;
    }
}