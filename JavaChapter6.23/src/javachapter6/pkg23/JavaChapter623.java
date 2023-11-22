package javachapter6.pkg23;

import java.util.Scanner;

public class JavaChapter623 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = sc.nextLine();

        System.out.print("Enter letter: ");
        char letter = sc.nextLine().charAt(0);

        System.out.println(count(word, letter));

    }

    public static int count(String str, char a) {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                counter++;
            }
        }

        return counter;
    }
}
