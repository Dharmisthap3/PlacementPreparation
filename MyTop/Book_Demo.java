import java.util.*;
public class Book_Demo{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String s= sc.next();
        
        Book b= new Book();
        Book_Publication bp = new Book_Publication("dumbass");
        Paper_Publication pp = new Paper_Publication("xxx");
        
        
        if(s.equals("bp")){
            b=bp;
        }
        else{
            b=pp;
        }
        b.printDetail();
    }
}

class Book{
    private String author_name;
    private String title;
    
    Book(){
        System.out.println(author_name);
    }
    
    Book(String title){
        this.title=title;
    }
    public void printDetail(){
        System.out.println(title);
    }
}
class Book_Publication extends Book{
    private String title;
    Book_Publication(String title){
        this.title=title;
    }
    public void printDetail(){
        System.out.println(title);
    }
}

class Paper_Publication extends Book{
    private String title;
    
    Paper_Publication(String title){
        this.title=title;
    }
    public void printDetail(){
        System.out.println(title);
    }
}