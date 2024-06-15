
public class perfectSquate {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int low=0,high=460000,mid;
        int target=1000;
        
        while(low<=high){
            mid=(low+high)/2;
            if(target==(mid*mid)){
                System.out.print("hi");
            }
            else if(target<(mid*mid)){
                high=mid-1;
            }
            else if(target<(mid*mid)){
                low=mid+1;
            }
        }
        
    }
    
}