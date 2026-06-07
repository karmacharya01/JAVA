// Write a program to Matrix Multiplication

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter rows of first matrix:");
        int row1 = input.nextInt();

        System.out.println("Enter columns of first matrix:");
        int column1 = input.nextInt();

        System.out.println("Enter rows of second matrix:");
        int row2 = input.nextInt();

        System.out.println("Enter columns of second matrix:");
        int column2 = input.nextInt();

        if (column1 != row2) {
            System.out.println("Matrix multiplication not possible");
            return;
        }

        int Matrix1[][] = new int[10][10];
        int Matrix2[][] = new int[10][10];
        int Matrix3[][] = new int[10][10];

        System.out.println("Enter values for Matrix1:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                Matrix1[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter values for Matrix2:");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                Matrix2[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column2; j++) {
                for (int k = 0; k < column1; k++) {
                    Matrix3[i][j] += Matrix1[i][k] * Matrix2[k][j];
                }
            }
        }

        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column2; j++) {
                System.out.print(Matrix3[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}