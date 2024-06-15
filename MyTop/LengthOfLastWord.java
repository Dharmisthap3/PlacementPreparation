import java.util.Scanner;
public class LengthOfLastWord {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string:");
        String s=sc.nextLine();
        String s1=s.trim();
        //System.out.println("original :"+s)
        //System.out.println("trimmed :"+s1);
        String s2="";
        for(int i=s1.length()-1;i>=0;i--){
            s2+=s1.charAt(i);
        }
        //System.out.println(s2);
        int j=0;
        int counter=0;
        for(j=0;(j<s2.length() && s2.charAt(j)!=' ');j++){
            counter++;
        }
        System.out.println(counter);
    }
    
}