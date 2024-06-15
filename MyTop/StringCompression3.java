
public class StringCompression3 {
    
    public static void main(String[] args) {
        int c=1;
        String word ="abcde";
        String comp="";
        for(int i=0;i+1<word.length();i++){
            if(word.charAt(i)==word.charAt(i+1)){
                c++;
            }
            else{
                if(c>=9){
            while(!(c<9))
              {
             comp+=(9+""+word.charAt(i));
                c=c-9;
              }
                }
                if(c<9){
                    comp+=(c+""+word.charAt(i));
                }
                c=1;
            }
        }
         if(c>=9){
            while(!(c<9))
              {
             comp+=(9+""+word.charAt(word.length()-1));
                c=c-9;
              }
                }
                if(c<9){
                    comp+=(c+""+word.charAt(word.length()-1));
                }
        System.out.println(comp);
    }
}