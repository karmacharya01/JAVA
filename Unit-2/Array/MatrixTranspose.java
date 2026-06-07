package Array;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {

        int a[][] = new int[3][3];
        int trans[][] = new int[3][3];

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the value for Matrix A:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    a[i][j] = input.nextInt();
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    trans[i][j] = a[j][i];
                }
            }
        }

        System.out.println("Sum of matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(trans[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
