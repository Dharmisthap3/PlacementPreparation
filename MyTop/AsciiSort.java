import java.util.*;
public class AsciiSort {
    
    public static void main(String[] args) {
        char[] c = {'e','E','O'};
        ArrayList<Character> ch = new ArrayList<>();
        ch.add('e');
        ch.add('E');
        ch.add('O');
        Collections.sort(ch);
        Iterator ic = ch.iterator();
        while(ic.hasNext()){
            System.out.println(ic.next());
        }
        System.out.println(ch.get(0));
    }
}