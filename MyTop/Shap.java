import java.util.Scanner;
public class Shap {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter radius of circle:");
        int radius=sc.nextInt();
        System.out.printf("Enter length of square:");
        int length=sc.nextInt();
        System.out.printf("Enter base and height of tringle:");
        int base=sc.nextInt();
        int height=sc.nextInt();
      
        Shape s = new Shape();
        s.area(radius,length,base,height);
    }
    
}

class Shape{
    public void area(int radius,int sqlength,int base,int height){
        System.out.println("area of circle :"+(3.14*radius*radius));
        System.out.println("area of square :"+(sqlength*sqlength)); 
        System.out.println("area of tringle :"+(base*height/2));
    }
}