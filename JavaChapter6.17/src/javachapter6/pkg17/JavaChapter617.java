package javachapter6.pkg17;

import java.util.Scanner;

public class JavaChapter617 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int input = sc.nextInt();

        printMatrix(input);
    }

    public static void printMatrix(int n) {
        int[][] matrix = new int[n][n];  //initialises 2D array
        int insert = (int) (Math.random() * 2);  //generates 0 or 1

        //System.out.println(insert);

        for (int i = 0; i < n; i++) {  //row
            for (int j = 0; j < n; j++) {  //column
                insert = (int) (Math.random() + 1);
                matrix[i][j] = insert;
                System.out.print(matrix[i][j]);  //prints element at i,j
            }
            System.out.print("\n");  //creates new row
        }

    }
}
