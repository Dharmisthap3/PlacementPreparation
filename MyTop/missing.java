import java.util.*;
public class missing {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] a = {2,2,4,5,5};
        String s="";
        for(int i=0;i<a.length;i++){
            s+=a[i];
        }
        System.out.println(s);
        for(int i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                System.out.println(s.charAt(i));
            }
        }
    }
    
}