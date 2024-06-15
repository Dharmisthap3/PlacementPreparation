
public class HammingDistance {
    
    public static void main(String[] args) {
        int[] nums ={4,14,4};
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int val = dist(nums[i],nums[j]);
                sum+=val;
            }
        }
        System.out.println(sum);
    }
    
    public static int dist(int a,int b){
        int val = a^b;
        int c=0;
        while(val!=0){
            val=val&val-1;
            c++;
        }
        return c;
    }
}