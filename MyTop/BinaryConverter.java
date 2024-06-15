import java.util.*;
public class BinaryConverter {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Stack<Integer> s = new Stack<>();
        int n = 2147483645;
        while(n != 0){
            s.add(n % 2);
            n = n / 2;
        }
       /* while(!s.empty()){
            System.out.print(s.pop());
        }*/
        int c=0;
        Iterator ic = s.iterator();
        while(ic.hasNext()){
            if((int)ic.next()==1){
               c++; 
            }
        }
        System.out.println(c);
    }
    
}