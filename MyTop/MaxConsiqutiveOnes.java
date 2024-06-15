import java.util.*;
public class MaxConsiqutiveOnes {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        //Stack<Integer> s = new Stack<>();
        int[] arr = {1,0,1,1,0,1};
        int currentmax=0,maxcount=0;
        for(int a:arr){
            if(a==1){
                currentmax++;
                maxcount= Math.max(maxcount,currentmax);
            }
            else{
                currentmax=0;
            }
        }
        System.out.println(maxcount);
    }
    
}