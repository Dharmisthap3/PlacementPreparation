
import java.util.*;
public class SecndStr {
    
    public static void main(String[] args) {
     //   System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        String str;
        int i,c=0;
        System.out.print("Enter a string: ");
        str=sc.nextLine();
        
        for(i=0;i<str.length();i++){
            c++;
            
           /* if(str.charAt(i) == ' '){
                c--;
            }
            
            */
        }
        
        System.out.println("The length of string is "+c);
        c=0;
        
        for(i=0;i<str.length();i++){
            
           if(str.charAt(i) != ' '){
                c++;
            }
            
            else{
           break; 
            }
            
        }
        //System.out.print("string length is "+c);
        System.out.print("The 2nd part of string:");
        for(i=c+1;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
    }
    
}