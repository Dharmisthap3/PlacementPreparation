
public class sumforloops {
    
    public static void main(String[] args) {
        double sum=0;
        int count=0;
        for(double i=0.01;i<=1.0;i=i+0.01){
            sum=sum+i;
            count++;
        }
        
        System.out.println("Sum is "+sum+"   "+count);
        
    }
    
}