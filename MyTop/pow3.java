import java.util.*;
public class pow3 {
    
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to check");
        int n= sc.nextInt();
        
        for(int i=0;i<=31;i++){
            li.add((int)Math.pow(3,i));
        }
        System.out.println(li);
        
    }
    
}