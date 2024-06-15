abstract class A{
    public void one(){
        System.out.println("one");
    }
    
    abstract public void two();
}

abstract class B extends A{
    @Override
    public void two(){
        System.out.println("two e");
    }
   abstract public void three();
    
    
    
}
public class Try {
    
    public static void main(String[] args) {
       System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        
        
    }
    
}