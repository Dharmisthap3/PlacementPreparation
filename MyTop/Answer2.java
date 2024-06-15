
public class Answer2 {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] arr = {-6,2,5,-2,-7,-1,3};
        int counter=0;
        int target=-2;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]+arr[j])<target){
                    counter++;
                } 
            }
        }
        System.out.println(counter);
    }
    
}