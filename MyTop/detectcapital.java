
public class detectcapital {
    
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        String s = "GoogLe";
        String s1 = s.toUpperCase();
        String s2 = s.toLowerCase();
        String s3 = s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
       // System.out.println(s3);
        if(s.equals(s1)||s.equals(s2)||s.equals(s3)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    
}