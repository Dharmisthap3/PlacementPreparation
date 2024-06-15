import java.io.*;
public class Fi {
    
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        try{
        File f1 = new File("hii.txt");
        f1.createNewFile();
        }catch(Exception w){
            w.printStackTrace();
        }
    }
    
}