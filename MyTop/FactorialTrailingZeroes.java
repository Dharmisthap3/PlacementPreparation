
public class FactorialTrailingZeroes {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int n=13;
        int ans =1;
        for(int i=1;i<=n;i++){
            ans=ans*i;
        }
        System.out.println(ans);
        int val = zerocounter(ans);
        System.out.println(val);
    }
    
    public static int zerocounter(int a){
        int counter=0;
        while(a!=0){
            if(a%10==0){
                counter++;
            }
            else{
                break;
            }
            a/=10;
        }
        return counter;
    }
}