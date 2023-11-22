package javaapplication2;

public class JavaApplication2 {

    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        System.out.println("Learning Java Now");
        System.out.println("Programming is Fun");

        System.out.println("----------------------------");

        System.out.println("   J");
        System.out.println("J aaa    v     vaaa");
        System.out.println("J  J  aa    v v    a a");
        System.out.println("J   aaaa     v     aaaa");

        System.out.println("----------------------------");

        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);

        System.out.println("----------------------------");

        double radius = 6.5;
        double pi = 3.14159;
        System.out.println("The area of a triangle with radius 6.5 is "
                + (radius * radius * pi));

        System.out.println("The perimeter of a triangle with radius 6.5 is "
                + (2 * radius * pi));

        System.out.println("----------------------------");

        int currentPopulation = 312032486;
        int firstYearPopulation = 0;
        int secondYearPopulation = 0;
        int thirdYearPopulation = 0;
        int fourthYearPopulation = 0;
        int fifthYearPopulation = 0;

        int birthEachYear = (86400 / 7) * 365;
        int immEachYear = (86400 / 45) * 365;
        int deathsEachYear = (86400 / 13) * 365;
        /*
One birth EVERY 7 seconds
One death EVERY 13 seconds
One new immigrant EVERY 45 seconds
TODO:
see how many 7 seconds in 365 days/1 year
see how many 13 seconds in 365 days/1 year
see how many 45 seconds in 365 days/1 year

add birth and immigrant numbers to currentPopulation for 5 years
subtract death numbers from currentPopulation for 5 years

1 day = 86400 seconds
therefore 86400/7 = 12,342.85... births every day
therefore 86400/13 = 6,646.15... deaths every day
therefore 86400/45 = 1920 new immigrants ever day
         */

        firstYearPopulation = (currentPopulation + birthEachYear + immEachYear) - deathsEachYear;
        secondYearPopulation = (firstYearPopulation + birthEachYear + immEachYear) - deathsEachYear;
        thirdYearPopulation = (secondYearPopulation + birthEachYear + immEachYear) - deathsEachYear;
        fourthYearPopulation = (thirdYearPopulation + birthEachYear + immEachYear) - deathsEachYear;
        fifthYearPopulation = (fourthYearPopulation + birthEachYear + immEachYear) - deathsEachYear;
        System.out.println(firstYearPopulation);
        System.out.println(secondYearPopulation);
        System.out.println(thirdYearPopulation);
        System.out.println(fourthYearPopulation);
        System.out.println(fifthYearPopulation);
    }

}
