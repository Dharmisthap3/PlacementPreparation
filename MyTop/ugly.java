
public class ugly {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int n=0,nmain=0;//1
        int noofterm=1,counter = 0;//2
        boolean istrue=true;
        while(counter<noofterm){
            n= nmain;//2
        while(n != 1){
            if(n % 2 == 0){
                n/=2;
            }
            else if(n % 3 == 0){
                n/=3;
            }
            else if(n % 5 == 0){
                n/=5;
            }
            else {
                istrue=false;
                System.out.println("no");
                break;
            }
        }
            
        if(istrue){
            //System.out.println("yes");
            counter++;
        }
            nmain++;
        }
        System.out.println(nmain--);
    }
    
}