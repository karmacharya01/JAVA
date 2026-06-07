package Array;

import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {

        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int sum[][] = new int[3][3];

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the value for Matrix A:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    a[i][j] = input.nextInt();
                }
            }
            System.out.println("Enter the value for Matrix B:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    b[i][j] = input.nextInt();
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Sum of matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
