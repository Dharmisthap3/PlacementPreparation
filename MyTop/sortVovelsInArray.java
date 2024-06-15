import java.util.*;
public class sortVovelsInArray {
    
    public static void main(String[] args) {
        String s ="hello";//holle
        HashMap<Integer,Character> h = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                h.put(i,c);
            }
        }
        char[] ch = new char[h.size()];
        int i=0;
        for(Map.Entry<Integer,Character> v:h.entrySet()){
            ch[i]=v.getValue();
            i++;
        }
        String an ="";
        int g=h.size()-1;
        for(int v=0;v<s.length();v++){
            if(h.containsKey(v)){
                an+=ch[g];
                g--;
            }
            else{
                an+=s.charAt(v);
            }
        }
        System.out.print(an);
    }
}