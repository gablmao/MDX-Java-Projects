/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javachapter6.pkg2;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class JavaChapter62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 2-digit or higher integer: ");
        int input = sc.nextInt();
        input = sumDigits(input);

        System.out.println("Sum of each integer in " + input + " is "
                + sumDigits(input));
    }

    public static int sumDigits(long n) {
        // THIS IS FOR EXERCISE2
        long extractLastInt = n;
        long total = 0;
        long removeLastInt;
        boolean notDone;
        notDone = true;

        while (notDone) {
            extractLastInt = extractLastInt % 10;
            total = total + extractLastInt;

            removeLastInt = extractLastInt / 10;

            if (removeLastInt == 0) {
                notDone = false;
            }
        }
        return (int) total;

    }

}
