import java.util.*;
public class selfdeviding {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter left and right");
        int left  =sc.nextInt();
        int right =sc.nextInt();
        int num,nummain;
        Stack<Integer> s = new Stack<>();
        for(int i=left;i<=right;i++){
            num = i;
           nummain=num; 
            while(num!=0){
                if(nummain<10){ 
                  s.add(num);
                   /* System.out.println(s);*/
                    break;                    
                }
                else if(num % 10==0) break;
                    else if((nummain % (num % 10))==0){
                    num/=10;
                }
                else{
                    break;
                }
            }
            if(num==0){
                s.add(nummain);
            }
        }
        System.out.println(s);
    }
    
}