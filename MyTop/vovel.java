
public class vovel {
    
    String s=new String();
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                c++;
            }
        }
        
        System.out.print("No of vovel: "+c);
    
    
}