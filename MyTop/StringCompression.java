
public class StringCompression {
    
    public static void main(String[] args) {
       char[] chars = {'a','a','b','b','c','c','c'};
        int n = chars.length;
       int index=0,c=1;
        for(int i=0;i+1<n;i++){
            if(chars[i]==chars[i+1]){
                c++;
            }
            
            else{
                if(c==1){
                    chars[index]=chars[i];
                    index++;
                }
                
                if(c>1 && c<10){
                     chars[index]=chars[i];
                    index++;
                    chars[index]=(char)(c+'0');
                    index++;
                }
                
                if(c>=10){
                    String cou = c+"";
                    chars[index]=chars[i];
                    index++;
                    for(int j=0;j<cou.length();j++){
                        chars[index]=cou.charAt(j);
                        index++;
                    }
                }
                c=1;
            }
        }
                if(c==1){
                    chars[index]=chars[n-1];
                    index++;
                }
                
                if(c>1 && c<10){
                     chars[index]=chars[n-1];
                    index++;
                    chars[index]=(char)(c+'0');
                    index++;
                }
                
                if(c>=10){
                    String cou = c+"";
                    chars[index]=chars[n-1];
                    index++;
                    for(int j=0;j<cou.length();j++){
                        chars[index]=cou.charAt(j);
                        index++;
                    }
                }
        
        for(char v :chars){
            System.out.println(v);
        }
    }
}