import java.util.*;
public class bmonth {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,month=0;
        System.out.println("Hello, World!");
        String set1=
        " 1 3 5 7\n"+
        " 9 11";
        
        String set2=
        " 2 3 6 7\n"+
        " 10 11";
        
        
        String set3=
        " 4 5 6 7\n"+
        " 12 ";
        
        String set4=
        " 8  9 10 11\n"+
        " 12 ";
        System.out.println("Is the month in set1?");
        System.out.println(set1);
        System.out.println("Enter 0 for no and 1 for yes");
        a=sc.nextInt();
        if(a==1){
            month= month+1;
        }
        
        
        System.out.println("Is the month in set2?");
        System.out.println(set2);
        System.out.println("Enter 0 for no and 1 for yes");
        a=sc.nextInt();
        if(a==1){
            month= month+2;
        }
        
        System.out.println("Is the month in set3?");
        System.out.println(set3);
        System.out.println("Enter 0 for no and 1 for yes");
        a=sc.nextInt();
        if(a==1){
            month= month+4; 
        }
        
        
        System.out.println("Is the month in set4?");
        System.out.println(set4);
        System.out.println("Enter 0 for no and 1 for yes");
        a=sc.nextInt();
        if(a==1){
            month= month+8;
        }
        System.out.println("month is "+month);
        
    }
    
}