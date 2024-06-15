import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class pow {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        List<Integer> l1 = new ArrayList<>();
        int ans=1;
        for(int i=0;i<=31;i++){
            l1.add((int)Math.pow(2,i));
        }
        int n=654;
        /*Iterator ic = l1.iterator();
        while(ic.hasNext()){
            System.out.println(p+")  "+ic.next());
            p++;
        }*/
        
        if(l1.contains(n)){
            System.out.print("true");
        }
        
        System.out.print((int)Math.pow(3,30));
    }
    
}