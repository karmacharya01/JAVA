package Array;

import java.util.Scanner;

public class MatrixMul {
     public static void main(String[] args) {

        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int mul[][] = new int[3][3];

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
                for (int k = 0; k < 3; k++) {
                mul[i][j] += a[i][k] + b[k][j];
            }}
        }

        System.out.println("Sum of matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mul[i][j] + "  ");
            }
            System.out.println();
        }

    }
    
}
