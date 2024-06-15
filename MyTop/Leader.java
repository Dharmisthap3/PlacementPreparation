import java.util.*;
public class Leader {
    
    public static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};
        ArrayList<Integer> li = new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            max=Math.max(max,arr[i]);
            
            if(arr[i]>=max){
                li.add(arr[i]);
            }
        }
        
        Iterator ic = li.iterator();
        while(ic.hasNext()){
            System.out.println(ic.next());
        }
    }
}