
public class GoatLatin {
    
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        String ret="";
        String sentence="The quick brown fox jumped over the lazy dog";
        String[] s = sentence.split(" ");
        for(int i=0;i<s.length;i++){
           boolean val = checker(s[i]);
            if(val){
                String vovelV = vovel(s[i]);
                ret+=vovelV+" ";
            }
            else{
                String consonentV = consonent(s[i]);
                ret+=consonentV+" ";
            }            
        }
        ret.trim();
//System.out.println(ret);  
        
   String[] app = ret.split(" ");    
        String finval = appnd(app);
        
        System.out.println(finval.trim().equals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"));
        
    }
    
    public static boolean checker(String s){
        boolean val=false;
        char a = s.charAt(0);
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
            val=true;
        }
        return val;
    } 
    
    public static String vovel(String v){
        StringBuilder sb  = new StringBuilder(v);
        sb.append("ma");
        return sb.toString();
    }
    
    public static String consonent(String c){
        StringBuilder sb2 = new StringBuilder(c);
        char ch = sb2.charAt(0);
        sb2.delete(0,1);
        sb2.append(ch+"ma");
        return sb2.toString();
    }
    
    public static String appnd(String[] app){
          String retvalhere="";
        for(int i=0;i<app.length;i++){
            StringBuffer sbv = new StringBuffer(app[i]);

              for(int j=-1;j<i;j++){
                  sbv.append("a");
              }
              retvalhere+=(sbv+" ").toString();
        }
        
        return retvalhere;
    }
}