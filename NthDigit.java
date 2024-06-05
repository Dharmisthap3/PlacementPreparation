//4.Given an integer n, return the nth digit of the infinite integer sequence[1,2,3,4,5,6,7....]
import java.util.Scanner;

public class NthDigit {
    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = nthDigit(n);
        System.out.println(ans);
        scanner.close();
    }

    static int nthDigit(int n) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            stringBuffer.append(i);
        }
        return Character.getNumericValue(stringBuffer.charAt(n));
    }
}
