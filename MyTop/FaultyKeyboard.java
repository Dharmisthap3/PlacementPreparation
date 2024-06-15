
public class FaultyKeyboard {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String s ="poiinter";
        StringBuffer sb  = new StringBuffer(s);
        StringBuffer sb2 = new StringBuffer("");
        for(int j=0;j<sb.length();j++){
            if(sb.charAt(j)!='i'){
                sb2.append(sb.charAt(j));
            }
            else{
                sb2.reverse();
            }
        }
        System.out.println(sb2);
    }
    
}