import java.util.*;
public class MultiplyString {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String s1 = "123";
        String s2 = "456";
        
        int one=0,two=0;
        
        for(int i=0;i<s1.length();i++){
            one=one*10+(s1.charAt(i)-'0');
        }
        for(int j=0;j<s2.length();j++){
            two=two*10+(s2.charAt(j)-'0');
        }
        System.out.println(one+"   "+two);
        
       /*
        char c = '4';
        int a = c - '0';
        System.out.println(a);
        
        */
    }
    
}