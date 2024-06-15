import java.util.*;
public class SetDemo {
    
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        Set<Integer> s = new HashSet<>();
        s.add(6);
        s.add(87);
        s.add(863);
        s.add(6);
        s.add(87);
        s.add(863);
        System.out.println(s);
    }
    
}