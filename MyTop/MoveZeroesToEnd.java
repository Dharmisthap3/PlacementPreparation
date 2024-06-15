
public class MoveZeroesToEnd {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] nums = {1,0,2,3,2,0,0,4,5,1};
        
        int ind=0,c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[ind]=nums[i];
                ind++;
            }
            else{
                c++;
            }
        }
        for(int i=ind;i<nums.length;i++){
            nums[i]=0;
        }
        
        for(int a :nums){
            System.out.print(a+", ");
        }
    }
    
}