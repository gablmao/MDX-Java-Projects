package javachapter2;

import java.util.Scanner;


public class JavaChapter2 {

    public static void main(String[] args) {
        // write under this to access to specific exercise 

        double area;

        System.out.print("Enter value for the radius -> ");

        /*
to be able to allow the user to input the radius, create a Scanner
e.g.,

Scanner sc = new Scanner(System.in);
int i = sc.nextInt();

the first line creates the Scanner object with a parameter System.in (console)
the "sc" is the name of the object
the second line creates a condition such that it asks specfically for an integer

if you wanted a string, then do:

String value = sc.nextLine();
         */

        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        area = radius * radius * Math.PI;

        System.out.println("The area of a circle is " + area);
        System.out.println("/------------------------------------------------");
        //exercise1();
    }




    public static void exercise1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value to convert miles to kilometres -> ");

        double miles = input.nextDouble();
        double kilometres;
        kilometres = miles * 1.6;

        System.out.println("Your value converted to kilometres is = " + kilometres);
        System.out.println("/------------------------------------------------");
        //exercise5();
    }

    public static void exercise5() {
        Scanner input = new Scanner(System.in);

        double gratuity;
        double Total;

        System.out.print("Enter your subtotal value -> ");
        double userSubtotal = input.nextDouble();
        System.out.print("Enter your gratuity rate -> ");
        double gratuityRate = input.nextDouble();

        gratuity = userSubtotal * (gratuityRate / 100);
        Total = userSubtotal + gratuity;

        System.out.println("Your gratuity = " + "$" + gratuity);
        System.out.println("Your Total is = " + "$" + Total);
        System.out.println("/------------------------------------------------");
        //exercise6();
    }

    public static void exercise6() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value between 0 and 1000 -> ");
        int value = input.nextInt();

        int firstMod = value % 10;
        int firstDiv = value / 10;
        int secondMod = firstDiv % 10;
        int secondDiv = firstDiv / 10;
        int thirdMod = secondDiv % 10;

        int Total = firstMod * secondMod * thirdMod;
        /*
do % 3 times and do / 2 times

example above with 932:
firstMod = 932 % 10 (2)
firstDiv = 932 / 10 (93)
secondMod = 93 % 10 (3)
secondDiv = 93 / 10 (9)
thirdMod = 93 % 10 (9)
         */

        System.out.println("The multiplication of all digits in " + value + " is " + Total);
        System.out.println("/------------------------------------------------");
//exercise7();
    }

    public static void exercise7() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes -> ");
        int val = input.nextInt();

        /*
minutes to days -> days % 365
minutes to years
         */
        int daysMod = (val / 1440) % 365;
        int minToYears = val / 525600;

        System.out.println("Converted in years and days is approx. -> " + minToYears + " and " + daysMod);
        System.out.println("/------------------------------------------------");
//exercise11();
    }

    public static void exercise11() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years -> ");
        int val = input.nextInt();

        int currentPopulation = 312032486;
        int firstYearPopulation;
        int secondYearPopulation;
        int thirdYearPopulation;
        int fourthYearPopulation;
        int fifthYearPopulation;

        int birthEachYear = (86400 / 7) * 365;
        int immEachYear = (86400 / 45) * 365;
        int deathsEachYear = (86400 / 13) * 365;

        firstYearPopulation = (currentPopulation + birthEachYear + immEachYear) - deathsEachYear;
        secondYearPopulation = (firstYearPopulation + birthEachYear + immEachYear) - deathsEachYear;
        thirdYearPopulation = (secondYearPopulation + birthEachYear + immEachYear) - deathsEachYear;
        fourthYearPopulation = (thirdYearPopulation + birthEachYear + immEachYear) - deathsEachYear;
        fifthYearPopulation = (fourthYearPopulation + birthEachYear + immEachYear) - deathsEachYear;

        if (val == 0) {
            System.out.println("The population in " + val + " years is " + currentPopulation);
        } else if (val == 1) {
            System.out.println("The population in " + val + " years is " + firstYearPopulation);
        } else if (val == 2) {
            System.out.println("The population in " + val + " years is " + secondYearPopulation);
        } else if (val == 3) {
            System.out.println("The population in " + val + " years is " + thirdYearPopulation);
        } else if (val == 4) {
            System.out.println("The population in " + val + " years is " + fourthYearPopulation);
        } else if (val == 5) {
            System.out.println("The population in " + val + " years is " + fifthYearPopulation);
        } else {
            System.out.println("Invalid Year");
        }
        System.out.println("/------------------------------------------------");
    }

}




/*
alternatively, you can use the method's "args", replace it to instead use it as 
the input, instead of needing the scanner to read it.

for this example:
double radius = args[0];

this means that the first parameter taken will be used as the radius, instead of
the Scanner input assuming scanner isn't present.

you can go to the class properties and manually input the arguments in the "run"
tab
 */
 /*
objects are placed in a Heap.
methods and LOCAL variables are placed/pushed in a Stack (First In Last Out).

when you do more PROCEDURAL programming, you focus more on the Stack.
the keyword "static" means that whether you're creating objects or not, it
will utilise the Stack instead of the Heap.
 */
 /*
difference between / and %:

/ is the standard symbol for division.
% is the standard symbol for modulus, finding the remainder of a division.
 */