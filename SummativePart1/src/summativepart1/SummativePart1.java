package summativepart1;

import java.util.Scanner;

public class SummativePart1 {

    static int[] player1Scores = new int[7];
    static int[] player2Scores = new int[7];
    /*
    index 0 = player1Ones
    index 1 = player1Twos
    index 2 = player1Threes
    index 3 = player1Fours 
    index 4 = player1Fives
    index 5 = player1Sixes
    index 6 = player1Sequence
    index 7 = player1Total
     */


 /*
        Player 1 = 1
        Player 2 = -1
        mulptiply by -1 to switch turns
        static int playerTurn = 1;
     */
    static int round = 1;

    public static void main(String[] args) {
        System.out.println("Dice Game");
        startGame();

    }

    public static void startGame() {
        boolean isGameFinished = false;
        Scanner input = new Scanner(System.in);

        while (isGameFinished == false) {
            System.out.print("Play Game (1) or Exit (0): ");
            int startOrEnd = input.nextInt();
            if (startOrEnd == 1) {
                gameLoop();
            } else if (startOrEnd == 0) {
                isGameFinished = true;
            }
        }

        System.out.println("Game ended.");
    }

    public static void printTable() {
        //print and update table here
        /*

----------------------------------------
|                 | Player 1 | Player2 |
----------------------------------------
|   Ones          |          |         |
----------------------------------------
|   Twos          |          |         |
----------------------------------------
|   Threes        |          |         |
----------------------------------------
|   Fours         |          |         |
----------------------------------------
|   Fives         |          |         |
----------------------------------------
|   Sixes         |          |         |
----------------------------------------
|   TOTAL         |     0    |    0    |
----------------------------------------

         */

    }

    public static void gameLoop() {

        //game won't end if round=7
        if (round > 7) {
            results();
        }
        System.out.println("Round " + round);
        round++;

        //subtract 1 for every throw until = 0
        int timesToThrow = 3;
        //subtract 2 for every throw until above is 0
        int dicesToThrow = 5;

        System.out.print("Throw dice, enter 't' to throw, or 'f' to forfeit: ");
        Scanner input = new Scanner(System.in);
        char throwOrForfeit = 0;
        int[] throwActionResult = new int[dicesToThrow];
        int settingsAsideDiceActionResult = 0;
        int sequenceActionResult = 0;

        while (throwOrForfeit != 't' || throwOrForfeit != 'f') {
            throwOrForfeit = input.nextLine().charAt(0);

            if (throwOrForfeit == 't') {
                throwActionResult = throwAction(timesToThrow, dicesToThrow);
            } else if (throwOrForfeit == 'f') {
                gameLoop();
            }
        }

        //after throwAction, transition to selecting category/defer roll
        System.out.println("Enter 's' to select category or 'd' to defer the rolls: ");
        char selectOrDefer = 0;
        int selectCategory = 0;
        int categoryOrSequence = 0;

        while (selectOrDefer != 's' || selectOrDefer != 'd') {
            selectOrDefer = input.nextLine().charAt(0);

            if (selectOrDefer == 's') {
                System.out.println("Ones(1) Twos(2) Threes(3) Fours(4) Fives(5) Sixes(6)"
                        + " or Sequence(7): ");

                while (selectCategory == 0 || selectCategory > 7) {
                    selectCategory = input.nextInt();
                    if (selectCategory < 7) {  //sequence not picked
                        categoryOrSequence = 1;
                        settingsAsideDiceActionResult = settingsAsideDiceAction(throwActionResult, selectCategory);
                    } else if (selectCategory == 7) {  //sequence picked
                        categoryOrSequence = 2;
                        System.out.println("Sequence 20 Selected.");
                        sequenceAction(throwActionResult);
                    }
                }

            } else if (selectOrDefer == 'd') {
                throwAction(timesToThrow, dicesToThrow);
            }
        }

        //action after selecting category here
        switch (categoryOrSequence) {
            case 1: //after settingsAsideDiceAction function

            case 2: //after sequenceAction function
        }

    }

    public static int[] throwAction(int timesToThrow, int dicesToThrow) {
        //generate dices
        int rngDice;
        //store dice throws into array
        int[] dice = new int[dicesToThrow];

        System.out.println(timesToThrow + " throws remaining for this turn.");
        System.out.print("Your rolls:");
        //print player dice rolls
        for (int i = 0; i < dicesToThrow; i++) {
            rngDice = (int) (Math.random() * 5) + 1;  //dice 1-6
            dice[i] = rngDice;
            System.out.print(" [" + rngDice + "] ");
        }

        return dice;

    }

    public static int settingsAsideDiceAction(int[] dice, int selectNum) {
        //counter for how many times category number chosen == dice number
        int diceCount = 0;

        //store dice of matching ones
        int[] sumDice = new int[dice.length];
        int sumDiceLiteral = 0;

        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == selectNum) {
                diceCount++;
                sumDice[i] = dice[i];
            }
        }

        System.out.println("That throw had " + diceCount + " dice(s) with value "
                + selectNum + ". Setting aside those dice.");

        //adding up total of dices put aside
        for (int j = 0; j < sumDice.length; j++) {
            sumDiceLiteral = dice[j] + sumDiceLiteral;
        }

        return sumDiceLiteral;
    }

    public static void sequenceAction(int[] arr) {
        //print options
        System.out.println("0. None");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + "." + "[" + arr[i] + "] ");
        }

        int[] dicesAside = new int[arr.length];

        System.out.print("Enter which dices you wish to set aside using the "
                + "number labels separated by a space (e.g., 1 2 4 5), or enter "
                + "0 for none: ");

        Scanner input = new Scanner(System.in);
        int diceToSetAside;
        boolean done = false;
        while (done == false) {
            diceToSetAside = input.nextInt();
            if (diceToSetAside == 0) {  //keep none of the dices
                done = true;
            } else {
                for (int i = 0; i < dicesAside.length; i++) {
                    dicesAside[i] = diceToSetAside;
                    done = true;
                }
            }

        }

        System.out.println("You have selected the following to keep: ");
        for (int i = 0; i < dicesAside.length; i++) {
            System.out.println("[" + dicesAside[i] + "] ");
        }


    }

 
    public static void results() {
        //only call this function if round>7

        //print results
        printTable();
        if (player1Scores[7] > player2Scores[7]) {
            System.out.println("Player 1 Won");
        } else {
            System.out.println("Player 2 Won");
        }
        //if players want to play the game again
        startGame();
    }
}
