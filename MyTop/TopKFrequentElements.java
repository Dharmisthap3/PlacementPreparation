import java.util.*;
public class TopKFrequentElements {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] nums ={1,1,1,1,1,2,2,3};
        int k=2;
        HashMap<Integer,Integer> h = new HashMap<>();
        
        for(int a : nums){
            h.put(a,h.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Integer,Integer> v : h.entrySet()){
            System.out.println(v.getKey()+" "+v.getValue());
        }
    }
}