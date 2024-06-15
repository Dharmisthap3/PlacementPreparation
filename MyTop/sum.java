
public class sum {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
       int[] arr = {1,36,7};
        int digsum=0,realsum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=9){
                digsum+=arr[i];
                realsum+=arr[i];
            }
            else if(arr[i]>=10){
                realsum+=arr[i];
                while(arr[i]!=0){
                    digsum+=arr[i]%10;
            arr[i]/=10;
                }
            }
        }        
        System.out.println(digsum+"    "+realsum);
    }
    
}