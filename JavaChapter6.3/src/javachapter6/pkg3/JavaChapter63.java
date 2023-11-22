package javachapter6.pkg3;

import java.util.Scanner;

public class JavaChapter63 {

    public static void main(String[] args) {
        //palindrome integer

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        if (isPalindrome(num)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }

    public static boolean isPalindrome(int number) {
        // THIS IS FOR EXERCISE 3

        if (number == reverse(number)) {
            return true;
        }
        return false;
    }

    public static int reverse(int number) {
        // THIS IS FOR EXERCISE 3
        // CONVERT INT TO STRING
        // using StringBuilder to create a new string from???

        String numStr = "" + number;
        StringBuilder sb = new StringBuilder(numStr);
        StringBuilder rev = sb.reverse();

        //
        String revStr = rev.toString();

        //converts to integer with Integer.parseInt
        int val = Integer.parseInt(revStr);

        return val;
    }

    public static boolean isPrime(int number) {

        for (int i = 2; i <= number / 2; i++) {
            if (i % 2 == 0) {  //perfect division
                return false;
            }
        }
        return true;
    }

}
