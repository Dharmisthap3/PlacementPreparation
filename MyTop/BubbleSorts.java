
public class BubbleSorts {
    
    public static void main(String[] args) {
        int[] nums ={37,4,5,1,90,45,3};
        
        for(int i=nums.length-1;i>=1;i--){
            for(int j=0;j+1<=i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        
        for(int a:nums){
            System.out.println(a);
        }
        
        // less efficient than insersion sort
    }
}