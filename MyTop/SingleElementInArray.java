
public class SingleElementInArray {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] nums ={1,1,2,2,3,3,4,8,8};
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans^=nums[i];
        }
        System.out.println(ans);
    }
}