import java.util.*;
public class MostCommonWord {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String paragraph = "a, a, a, a, b,b,b,b,c, c";
        String[] banned = {"a"};
        String check="";
        for(int i=0;i<banned.length;i++){
            check+=banned[i];
        }
        String p2 =paragraph.toLowerCase();
        String p3="";
        for(int i=0;i<p2.length();i++){
            if(p2.charAt(i)>=97 && p2.charAt(i)<=122){
                p3+=p2.charAt(i);
            }
        }
       
        HashMap<String,Integer> h = new HashMap<>();
        String[] sa = p3.split(" ");
        int counter=0;
        for(int i=0;i<sa.length;i++){
            if(h.containsKey(sa[i])){
                counter=h.get(sa[i]);
                counter++;
                h.put(sa[i],counter);
            }
            else{
                counter=0;
                counter++;
                h.put(sa[i],counter);
            }
        }
        SortedMap<Integer,String> hm = new TreeMap<>();
        for(Map.Entry<String,Integer> v:h.entrySet()){
            if(!check.contains(v.getKey())){
                hm.put(v.getValue(),v.getKey());
            }
        
        }
        
        System.out.println(hm.get(hm.lastKey()));
        
        /*for(Map.Entry<String,Integer> v:hm.entrySet()){
        System.out.println(v.getValue()+"  "+v.getKey());
        }
        */
        
        
    }
}