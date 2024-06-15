
public class Binarysearch {
    
    public static void main(String[] args) {
      //  System.out.println("Hello, World!");
        int[] arr = {1,2,3,4,5,6};
        int high=arr.length-1;
        int low=0;
        int mid=(high+low)/2;
        int key =2;
        while(high>=low){
            mid=(high+low)/2;
            if(key<arr[mid]){
                high=mid-1;
            }
            
            else if(key==arr[mid]){
                System.out.println(mid);
            break;
        }
            else{
                low=mid+1;
            } 
            
        }
    }
    
}