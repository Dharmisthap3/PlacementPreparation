
public class Selection {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] arr = {8,78,9,86,4,2,5};
        
        for(int i=0;i<arr.length;i++){
            int min_val=arr[i];
            int index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min_val){
                    min_val=arr[j];
                    index=j;
                }
            }
            int change;
                change=arr[i];
               arr[i]=arr[index];
                arr[index]=change;
        }
        for(int b:arr){
            System.out.println(b);
        }
    }
    
}