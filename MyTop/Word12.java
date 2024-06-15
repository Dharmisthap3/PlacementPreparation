import java.util.Scanner;
import java.io.*;
public class Word12 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word1");
        String word1 = sc.next();
        System.out.println("Enter word2");
        String word2 = sc.next();
        //System.out.println(s.replace("o","world"));
        try{
            BufferedReader b1 = new BufferedReader(new FileReader("hi.txt"));
            BufferedWriter b2 = new BufferedWriter(new FileWriter("hello.txt"));
            String s;
            int counter=0;
            while((s=b1.readLine())!=null){
                if(s.contains(word1)){
                    counter++;
                }
                b2.write(s.replace(word1,word2));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}