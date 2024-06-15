
public class sry {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] a = {2,2,0,1,1};
        
        for(int i=0;i<a.length;i++){
            int min = a[i];
            int ind = i;
            
            for(int j=i+1;j<a.length;j++){
                if(a[j]<min){
                    min=a[j];
                    ind = j;
                }
            }
            int temp= a[i];
            a[i]=min;
            a[ind]=temp;
        }
        
        for(int e:a){
            System.out.println(e);
        }
    }
    
}