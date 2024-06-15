
public class AppendCharacterToStringToMakeSubSequence {
    
    public static void main(String[] args) {
        String s = "coaching";
        String t = "coding";
        int counter=0;
        
        for(int i=0;i<t.length();i++){
            if(s.indexOf(t.charAt(i))==-1){
                counter++;
            }
        }
        System.out.println(counter);
    }
}