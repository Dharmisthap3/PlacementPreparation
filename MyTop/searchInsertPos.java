
public class searchInsertPos {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        int[] a = {1,3,5,6};
        int target=2;
        int low = 0;
        int high = a.length-1;
        int mid=(low+high)/2;
        boolean istrue=true;
        while(low<=high){
            mid=(low+high)/2;
            if(a[mid]==target){
                istrue=false;
                System.out.println(a[mid]);
                break;
            }
            else if(a[mid]>target){
                high = mid-1;
            }
            else if (a[mid]<target){
                low = mid+1;
            }
        }
        if(istrue)
        System.out.println(mid);
    }
    
}