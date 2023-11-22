package javachapter4;


/*
IMPORTANT!!!! READ THIS TO KNOW HOW TO GO AROUND


TO CHANGE TO DIFFERENT EXERCISES:
> GO TO THE MAIN METHOD
> AT THE TOP OF MAIN METHOD, THE METHOD TO SAID EXERCISE WILL BE THERE
> REPLACE THE NUMBER OF THE EXERCISE TO YOUR CHOICE


IMPORTANT!!!! READ THIS TO KNOW HOW TO GO AROUND
 */
import java.util.Scanner;

public class JavaChapter4 {

    public static void main(String[] args) {
//REPLACE EXERCISE NUMBER HERE
        exercise25();
//REPLACE EXERCISE NUMBER HERE


        /*

> byte --> short --> int --> long --> float --> double

Unicode:
> a 'char' type that can hold 16 bits instead of the typical 8 bits
 > ASCII typically holds 8 bits
 > therefore, Unicode is useful for representing more unique characters
    in the world.

         */
        char aChar = 'a';
        int aInt = 97;

        System.out.println(aChar);
        System.out.println((int) aChar);
        System.out.println("------");
        System.out.println(aInt);
        System.out.println((char) aInt);

        /*
characters represented as integers.
if you were to increment the character, after casting, then the output
would be the next character in the Unicode.
In the case above, 97 + 1 = 98 which is the ASCII for character 'b'.

Unicode's format looks like this --> '\u0061

--------------------EXAMPLE CODE--------------------
char aChar = \u0061
for (int i = 0; i < 25; i++) {
 System.Out.print(aChar + " ");
 aChar++;
}
--------------------EXAMPLE CODE--------------------


'Wrapper' class:

Scanner sc = new Scanner(System.in);

char c = sc.nextLine().charAt(0);



convert char to String using "String.valueOf(charVariable)"
compare formats using "stringVariable.matches(\\d{n})" -> boolean output
    > n is the length in this part of format
    > \\ is used to to separate parts of format
        > boolean compare = input.matches("\\d{3}-\\d{2}-\\d{4}");
        > input = "ABC-12-DEFG"
            > length 3 - length 2 - length 4

convert any character to lowercase with "Character.toLowerCase(charVariable)"
    > uppercase with "Character.toUpperCase(charVariable)"
         */
    }

    public static void exercise8() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an ASCII character: ");

        char input = sc.nextLine().charAt(0);
// without charAt, gives error as you can't convert String to char

        System.out.println("The ASCII code for " + input + " is "
                + (int) input);
    }

    public static void exercise13() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter: ");

        char input = sc.nextLine().charAt(0);

        if (Character.isLetter(input)) {
            char con = Character.toLowerCase(input);

            switch (con) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("The letter is a Vowel.");
                    break;

                default:
                    System.out.println("The letter is a consonant.");
            }

        } else {
            System.out.println("Invalid Input.");
        }

    }

    public static void exercise15() {
        Scanner sc = new Scanner(System.in);
        /*String numpad
                = "1 2 3 \n"
                + "4 5 6 \n"
                + "7 8 9 \n"
                + "* 0 #";
         */

        System.out.print("Enter a letter: ");

// a starts at 2, each number has 3 characters except for 7 and 9, with 4.
        char input = sc.nextLine().charAt(0);
        char convert = Character.toLowerCase(input);

        switch (convert) {
            case 'a':
            case 'b':
            case 'c':
                System.out.println("Corresponding number in a numpad is 2.");
                break;
            case 'd':
            case 'e':
            case 'f':
                System.out.println("Corresponding number in a numpad is 3.");
                break;
            case 'g':
            case 'h':
            case 'i':
                System.out.println("Corresponding number in a numpad is 4.");
                break;
            case 'j':
            case 'k':
            case 'l':
                System.out.println("Corresponding number in a numpad is 5.");
                break;
            case 'm':
            case 'n':
            case 'o':
                System.out.println("Corresponding number in a numpad is 6.");
                break;
            case 'p':
            case 'q':
            case 'r':
            case 's':
                System.out.println("Corresponding number in a numpad is 7.");
                break;
            case 't':
            case 'u':
            case 'v':
                System.out.println("Corresponding number in a numpad is 8.");
                break;
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                System.out.println("Corresponding number in a numpad is 9.");
                break;
            case '+':
                System.out.println("Corresponding symbol in a numpad is *.");
                break;
            case ' ':
                System.out.println("Corresponding number in a numpad is 0.");
                break;
            case '#':
                System.out.println("That's a #.");
                break;
            default:
                System.out.println("Invalid Input.");
        }

    }

    public static void exercise21() {
        System.out.println("Write your Social Security Number in this format: "
                + "DDD-DD-DDDD");
        System.out.print("Your SSN --> ");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        boolean compare = input.matches("\\d{3}-\\d{2}-\\d{4}");
// \\d{n} is the format if you want to compare formats of strings

        if (compare) {
            System.out.println(input + " is a valid Social Security Number.");
        } else {
            System.out.println(input + " is not a valid Social Security Number.");
        }
    }

    public static void exercise22() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string s1: ");
        String s1 = sc.nextLine();
        System.out.println("Enter string s2: ");
        String s2 = sc.nextLine();

        System.out.println(s2 + " is a substring of " + s1);
        System.out.println(s2 + " is NOT a substring of " + s1);
    }

    public static void exercise24() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first country: ");
        String c1 = sc.nextLine();

        System.out.print("Enter the second country: ");
        String c2 = sc.nextLine();

        System.out.print("Enter the third country: ");
        String c3 = sc.nextLine();

//get first letter of each input to compare and order
        char convert1 = c1.charAt(0);
        char convert2 = c2.charAt(0);
        char convert3 = c3.charAt(0);

        System.out.println("In descending order of the countries: ");
        if (convert1 > convert2 && convert1 > convert3) {
            if (convert2 > convert3) {
                System.out.println(c1 + " " + c2 + " " + c3);
            } else {
                System.out.println(c1 + " " + c3 + " " + c2);
            }
        }

        if (convert2 > convert1 && convert2 > convert3) {
            if (convert1 > convert3) {
                System.out.println(c2 + " " + c1 + " " + c3);
            } else {
                System.out.println(c2 + " " + c3 + " " + c1);
            }
        }

        if (convert3 > convert1 && convert3 > convert2) {
            if (convert1 > convert2) {
                System.out.println(c3 + " " + c1 + " " + c2);
            } else {
                System.out.println(c3 + " " + c2 + " " + c1);
            }
        }
    }

    public static void exercise25() {
        System.out.println("Generating a random vehicle plate number: ");

//format of vehicle numberplate = ABC1234
//generate number from 65 to 90 (letter A to Z in Unicode)
        int lower_bound = 65;
        int upper_bound = 90;
        int letter_range = (upper_bound - lower_bound) + 1;

        int text1 = (int) (Math.random() * letter_range) + lower_bound;
        int text2 = (int) (Math.random() * letter_range) + lower_bound;
        int text3 = (int) (Math.random() * letter_range) + lower_bound;

        char textPlate1 = (char) text1;
        char textPlate2 = (char) text2;
        char textPlate3 = (char) text3;
        //System.out.println(text1);
        //System.out.println(textPlate1);

//convert three numbers to String, Unicode characters
        String combine1 = String.valueOf(textPlate1);
        String combine2 = String.valueOf(textPlate2);
        String combine3 = String.valueOf(textPlate3);
        //System.out.println(combine1);
        //combine1 == textPlate1 visually, and so on...

        String combineText = combine1 + combine2 + combine3;

//generate number such that it's between 1000 and 9999 (4 digit number)
        int lowerBound = 1000;
        int upperBound = 9999;
        int range = (upperBound - lowerBound) + 1;
        int numberPlate = (int) (Math.random() * range) + lowerBound;

        System.out.println(combineText + numberPlate);
    }
}
