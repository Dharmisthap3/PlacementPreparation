
public class FirstandLastIndexOfElement {
    
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target=7;
        int low =0;
        int high = nums.length-1;
        int mid=0;
        while(low<=high)
        {
            mid = (low+high)/2;
            if(nums[mid]==target){
                if(mid-1>=0 && nums[mid-1]==target){
                    System.out.println(mid+" "+(mid-1));
                    break;
                }
                
                else if(mid+1<nums.length && nums[mid+1]==target){
                    System.out.println(mid+" "+(mid+1));
                break;
                }
            }
            
            else if(nums[mid]<target){
                low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
        }
    }
}