import java.util.*;
public class FindLuckyIntegerInAnArray {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] arr = {2,3,4,4,4};
        HashMap<Integer,Integer> h = new HashMap<>();
        
        for(int a:arr){
            h.put(a,h.getOrDefault(a,0)+1);
        }
        int max = -1;
        for(Map.Entry<Integer,Integer> v:h.entrySet()){
            if(v.getValue()==v.getKey()){
                max = Math.max(max,v.getKey());
            }
        }
        System.out.println(max);
    }
}