import java.util.*;
public class SortTheSentence {
    
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
       String  s = "is2 sentence4 This1 a3";
        SortedMap<Integer,String> sm = new TreeMap<>();
        String[] sa = s.split(" ");
        for(int i=0;i<sa.length;i++){
            String s1 = sa[i].substring(0,sa[i].length()-1);
            String s2 = sa[i].substring(sa[i].length()-1);
            int a = Integer.parseInt(s2);
            sm.put(a,s1);
        }
        String ans="";
        for(Map.Entry<Integer,String> v:sm.entrySet()){
            //System.out.println(+v.getKey()+"  "+v.getValue());
            ans+=(v.getValue()+" ");
        }
       // System.out.println(ans.trim());
    }
}