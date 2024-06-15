
public class ThousandSeperator {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int n = 987;
        StringBuffer sb = new StringBuffer(n+"");
        sb.reverse();
        //7654321
        //765.432.1
        String ans="";
         for(int i=0;i<sb.length();i++){
            if((i+1)%3==0){
                ans+=sb.charAt(i)+".";
            }
            else{
                ans+=sb.charAt(i)+"";
            }
        }
        StringBuffer sb2 = new StringBuffer(ans);
        sb2.reverse();
        if(sb2.charAt(0)=='.'){
            sb2.delete(0,1);
        }
        System.out.println(sb2);
    } 
}