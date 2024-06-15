import java.util.Scanner;
public class Strpeli {
    
    public static void main(String[] args) {
       
        String str = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        str = sc.nextLine();
        int x=0;
        char f =str.charAt(0);
        char l =str.charAt(str.length()-1);
        
        for(int i=0;i<str.length();i++){
            
            if(str.charAt(f)!=str.charAt(l)){
                x++;
                break;
            }
            f++;
            l--;
        }
        if(x==1){
            System.out.println("not peli");
        }
        
        else{
            System.out.println("peli");
        }
        
    }
    
}