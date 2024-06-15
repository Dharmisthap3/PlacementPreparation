
public class Xn {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
       int[] b = new int[3];
        b[0]=6;
        b[1]=0;
        b[2]=36;
            
        for(int i=0;i<b.length;i++){
            int min=b[i];
            int len=i;
            for(int j=i+1;j<b.length;j++){
            if(b[j]<min){
                min=b[j];
                len=j;
            }
        }
            int change = b[i];
            b[i]=min;
            b[len]=change;
        }
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}

/*
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
*/