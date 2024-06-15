import java.util.*;
public class StringAsPanagram {
    
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelaydog";
        char[] c = sentence.toCharArray();
        int counter=0;
        HashMap<Character,Integer> h = new HashMap<>();
        for(int i=0;i<c.length;i++){
            if(h.containsKey(c[i])){
                counter=h.get(c[i]);
                counter++;
                h.put(c[i],counter);
            }
            else{
                counter=0;
                counter++;
                h.put(c[i],counter);
            }
        } 
        if(h.size()<26){
            System.out.println("no");
        }else{
            System.out.println("yes");
        }
        
    }
}