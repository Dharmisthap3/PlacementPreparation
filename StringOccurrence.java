//1. Given two strings needle and haystack, return the index of the first occurance of needle in haystack ,or 1 if needle is not part of haystack.
import java.util.Scanner;

public class StringOccurrence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hayStack String : ");
        String hayStack = scanner.nextLine();
        System.out.println("Enter needle String : ");
        String needle = scanner.nextLine();
        int ans = findOccurrence(hayStack, needle);
        System.out.println(ans);
        scanner.close();
    }

    static int findOccurrence(String hayStack, String needle) {
        boolean isContains = hayStack.contains(needle);
        int index = 0;
        if (isContains) {
            index = hayStack.indexOf(needle);
        } else {
            return -1;
        }
        return index;
    }
}
