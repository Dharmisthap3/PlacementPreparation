
public class arays {
    
    public static void main(String[] args) {
     //   System.out.println("Hello, World!");
      int[] arr=new int[5];
        double[] ar= {1,2,3,6,7};

        
        for(int i=0;i<ar.length;i++){
            //System.out.println(ar[i]);
           ar[i]=Math.random()*100;
        }
        
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
        System.out.println("   ");
        double max=ar[0];
              //  System.out.println("size "+arr.length);
        for(int i=0;i<ar.length;i++){
            //System.out.println(ar[i]);
            if(ar[i]>max){
                max=ar[i];
            }
            
        }
        System.out.println(max);
        
    }
    
}