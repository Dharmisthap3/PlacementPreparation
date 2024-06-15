
public class SortArrayByParity {
    
    public static void main(String[] args) {
        int[] nums = {4,1,2,3};
        int[] b = new int[nums.length];
        int i=0,j=nums.length-1;
        //4 2 3 1
        for(int p=0;p<nums.length;p++){
            if(nums[p]%2==0){
                b[i]=nums[p];
                i++;
            }
            else{
                b[j]=nums[p];
                j--;
            }
        }
        for(int ab:b){
            System.out.println(ab);
        }
    }
}