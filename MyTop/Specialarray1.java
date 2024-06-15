
public class Specialarray1 {
    
    public static void main(String[] args) {
        int[] nums = {2,1,4};
        boolean istrue=false;
        for(int i=0;i+1<nums.length;i++){
            if((nums[i]%2==0 &&nums[i+1]%2!=0)||(nums[i+1]%2==0 && nums[i]%2!=0)){
                istrue=true;
            }
            else{
                istrue=false;
                break;
            }
        }
        if(istrue){
            System.out.println("yesh");
        }
        else{
            System.out.println("no");
        }
    }
}