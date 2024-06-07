// 1. W.A.P. to find the largest number from given 3 numbers using conditional operator.
// 2. W.A.P. to check given number is prime or not.
// 3. W.A.P. to check given number is palindrome or not.
// 4. W.A.P. to check given number is odd or even using bitwise operator.
// 5. W.A.P. to print series 1, 3, 6, 10, 15, …
// 6. W.A.P. to read n numbers in an array and print the sum of odd numbers &amp; even numbers.
// 7. W.A.P. to print odd numbers that are divisible by 7 but not divisible by 3 between 150 and 445.
// 8. W.A.P. that copies itself in another file called code.txt.
// 9. W.A.P. to read n numbers in an array and remove the duplicates from an array.
// 10. W.A.P. to read the size of square and character to print the square.
// Example:
// Enter the size of square: 5
// Enter the character: #
// # # # # #
// #       #
// #       #
// #       #
// # # # # #
// 11. An electricity board charges the following rates for the use of electricity: For the first 200 units
// 80 paisa per unit, For the next 100 units 90 paisa per unit and beyond 300 units Rs 1.00 per unit.
// All users are charged minimum of Rs.100 as meter charge. If the total amount is more than Rs.
// 300 then an additional surcharge of 12.36% of total amount is charged. W.A.P. to read the
// number of units consumed and print out the bill amount.
// 12 Accept two integers from the user and calculate the sum of last digits of both the integers. For
// example, if the numbers are 27 and 459, then the sum of last digits would be 16 (i.e. 7 + 9).
// 13 Accept three integer values from the user and display them in ascending order using only
// operators (i.e. without using if…else, switch case, or loop).
// 14 Accept a positive number from the user and print a message stating whether the number
// entered is even or odd WITHOUT using the module (%)operator and if... else statements.
// 15 Create a program that would accept a string from the user and print a pattern. For example, if
// the user enters “Hello”, it should print a pattern as follows:
// H
// He
// Hel
// Hell
// Hello

import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = 3;
            int maximum;
            System.out.println("Enter a number : ");
            int a = scanner.nextInt();
            System.out.println("Enter a number : ");
            int b = scanner.nextInt();
            System.out.println("Enter a number : ");
            int c = scanner.nextInt();
            maximum = a > b ? a : b > c ? b : c;
            while (count-- != 0) {
                int minimum = a < b ? a : b < c ? b : c;
                System.out.println(minimum);
                a = minimum == a ? maximum : a;
                b = minimum == b ? maximum : b;
                c = minimum == c ? maximum : c;
            }
        }
    }
}
