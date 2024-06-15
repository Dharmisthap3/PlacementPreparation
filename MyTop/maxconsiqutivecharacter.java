
public class maxconsiqutivecharacter {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String s="abbcccddddeeeeeffgh";
        int maxcounter=1,currentcounter=1;
        for(int i=0;i+1<s.length();i++){
            if(s.charAt(i)==s.charAt(i+1)){
                currentcounter++;
                maxcounter=Math.max(maxcounter,currentcounter);
            }
            else{
                currentcounter=1;
            }
        }
        maxcounter=Math.max(maxcounter,currentcounter);
        System.out.println(maxcounter);
    }
    
}