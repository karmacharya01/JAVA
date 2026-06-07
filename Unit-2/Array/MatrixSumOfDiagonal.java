package Array;

import java.util.Scanner;

public class MatrixSumOfDiagonal {
    public static void main(String[] args) {

        int a[][] = new int[3][3];
        int b = 0;

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
                if (i == j) {
                    b += a[i][j];

                }
            }
        }

        System.out.println("Sum of diagonal matrix:");
        System.out.println(b);
        System.out.println();
    }
}
