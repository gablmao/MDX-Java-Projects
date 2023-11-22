package javachapter5;

import java.util.Scanner;


/*
IMPORTANT!!!! READ THIS TO KNOW HOW TO GO AROUND


TO CHANGE TO DIFFERENT EXERCISES:
> GO TO THE MAIN METHOD
> AT THE TOP OF MAIN METHOD, THE METHOD TO SAID EXERCISE WILL BE THERE
> REPLACE THE NUMBER OF THE EXERCISE TO YOUR CHOICE


IMPORTANT!!!! READ THIS TO KNOW HOW TO GO AROUND
 */
public class JavaChapter5 {

    public static void main(String[] args) {
//REPLACE EXERCISE NUMBER HERE
        exercise41();
//REPLACE EXERCISE NUMBER HERE
        // System.out.println("Hello World!");

        /*
LOOPS YIIIIIIIIIPPPIEEIIEIIEEEEEEEEE

FOR LOOPS
WHILE LOOPS
DO WHILE LOOPS

FOR AND WHILE LOOPS checks if the condition is true before executing the code
DO WHILE LOOPS executed the code block first, THEN check the condition


the "break" statement works such that in a loop it terminates the loop
the continue statement works such that in a loop it terminates the iteration
    > terminating an iteration means that the rest of the code in the loop is
    not executed

         */
    }

    public static void exercise1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score = 0;

// if score <60, fail. if score >=60, pass.
        while (score == 0) {
            score = sc.nextInt();
            if (score >= 60 && score <= 100) {
                System.out.println("You passed.");
                score = 0;
            } else if (score > 100 || score < 0) {
                System.out.println("You can't get over 100 or under 0.");
                score = 0;
            } else {
                System.out.println("You failed.");
                score = 0;
            }

        }

    }

    public static void exercise8() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");

        int numStudents = input.nextInt();
        int i = 0;  // variable to iterate up to numStudents

        String studentName;
        int studentScore = 0;
        int ScoreToOutput = 0;
        String NameToOutput = null;

        do {
            System.out.print("Enter their name: ");
            studentName = input.next();
            System.out.print("Enter their score: ");
            studentScore = input.nextInt();

            if (ScoreToOutput < studentScore) {
                ScoreToOutput = studentScore;
                NameToOutput = studentName;
            }

            i++;
        } while (i != numStudents);

        System.out.println(NameToOutput + " has the highest score of "
                + ScoreToOutput);
    }

    public static void exercise9() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int NumStudents = input.nextInt();
        int i = 0;  // variable to iterate up to numStudents

        String StudentName;
        int StudentScore = 0;
        int LowestScore = 0;
        int LowestScore2 = 0;
        String LowestStudent = null;
        String LowestStudent2 = null;

        do {
            System.out.print("Enter their name: ");
            StudentName = input.next();
            System.out.print("Enter their score: ");
            StudentScore = input.nextInt();

            if (LowestScore <= LowestScore2) {
                LowestScore = StudentScore;
                LowestStudent = StudentName;
            } else if (LowestScore > StudentScore && LowestScore2 < StudentScore) {
                LowestScore2 = StudentScore;
                LowestStudent2 = StudentName;
            }

            i++;
        } while (i != NumStudents);

        System.out.println("Lowest Score: " + LowestScore2 + " by " + LowestStudent2);
        System.out.println("2nd Lowest Score: " + LowestScore + " by " + LowestStudent);
    }

    public static void exercise15() {
        System.out.println("lol");
    }

    public static void exercise18() {
        int rows = 6;
// i handles rows
// j handles number of times * is being printed in a row

//pattern A
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println(" ");
        }

        System.out.println(" ");  //separate patterns

//pattern B
        for (int i = rows; i > 0; --i) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println(" ");
        }

        System.out.println(" ");  //separate patterns

//pattern C
        for (int i = 0; i < rows; i++) {
            //adds extra white space at initial row
            for (int j = 2 * (rows - i); j > 0; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }
            //creates next row
            System.out.println(" ");
        }

        System.out.println(" ");  //separate patterns

//pattern D
        for (int i = rows; i > 0; --i) {
            for (int j = 2 * (rows - i); j > 0; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println(" ");
        }

        System.out.println(" ");  //separate patterns

    }

    public static void exercise34() {
        //rock paper scissors game

        Scanner choice = new Scanner(System.in);

        final int ROCK = 0;
        final int PAPER = 1;
        final int SCISSORS = 2;

        int userWins = 0;  //keeps count of user wins -> userWins++;
        int programWins = 0;  //keeps cound of user losses -> programWins++;
        boolean userWon = false;
        boolean programWon = false;

        //System.out.println(programChoice);
        do {
            int programChoice = (int) (Math.random() * 3);
            System.out.println("The program made a choice between rock, paper or scissors.");
            System.out.print("Make your choice (0 - rock, 1 - paper, 2 - scissors): ");
            int userChoice = choice.nextInt();

            //if user NOT inputs 0-2, end program
            if (!(userChoice >= 0 && userChoice <= 2)) {
                System.out.println("Invalid Input");
            } else {
                switch (programChoice) {
                    case ROCK:
                        System.out.println("Program chose ROCK");
                        switch (userChoice) {
                            case ROCK:
                                System.out.println("You picked ROCK");
                                System.out.println("It's a Tie!");
                                continue;
                            case PAPER:
                                System.out.println("You picked PAPER");
                                System.out.println("You Win!");
                                userWins++;
                                break;
                            case SCISSORS:
                                System.out.println("You picked SCISSORS");
                                System.out.println("You Lose!");
                                programWins++;
                                break;
                            default:
                                System.out.println("Error");
                        }
                        break;
                    case PAPER:
                        System.out.println("Program chose PAPER");
                        switch (userChoice) {
                            case ROCK:
                                System.out.println("You picked ROCK");
                                System.out.println("You Lose!");
                                programWins++;
                                break;
                            case PAPER:
                                System.out.println("You picked PAPER");
                                System.out.println("It's a Tie!");
                                continue;
                            case SCISSORS:
                                System.out.println("You picked SCISSORS");
                                System.out.println("You Win!");
                                userWins++;
                                break;
                            default:
                                System.out.println("Error");
                        }
                        break;
                    case SCISSORS:
                        System.out.println("Program chose SCISSORS");
                        switch (userChoice) {
                            case ROCK:
                                System.out.println("You picked ROCK");
                                System.out.println("You Win!");
                                userWins++;
                                break;
                            case PAPER:
                                System.out.println("You picked PAPER");
                                System.out.println("You Lose!");
                                programWins++;
                                break;
                            case SCISSORS:
                                System.out.println("You picked SCISSORS");
                                System.out.println("It's a Tie!");
                                continue;
                            default:
                                System.out.println("Error");
                        }
                        break;
                    default:
                        System.out.println("Error");
                }
            }

            if (userWins - programWins == 3) {
                userWon = true;
                System.out.println("You win over 3 rounds!");
            } else if (programWins - userWins == 3) {
                programWon = true;
                System.out.println("The Program won over you 3 rounds overall!");
            }
        } while (userWon == false && programWon == false);

    }

    public static void exercise41() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers (end with 0): ");

        int max = 0;  //largest number in input
        int count = 0;  //number of times largest number is found in input
        boolean done = false;

        while (done == false) {
            int input = sc.nextInt();

            if (max < input) {  //update largest number to max
                max = input;
                count = 0;
            }

            if (max == input) {  //increment for every largest number found
                count++;
            }

            if (input == 0) {  //end loop
                done = true;
            }
        }

        System.out.println("Largest Number: " + max);
        System.out.println("No. Occurence of largest number: " + count);
    }

}
