
import java.util.Scanner;

class Arrrry {
    public static void main(String[] args) {
        int r, c;
        int[][] a = new int[5][5];

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the no of Rows and Cols:");
            r = input.nextInt();
            c = input.nextInt();

            System.out.println("Enter the elements of matrix:");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    a[i][j] = input.nextInt();
                }
            }

            System.out.println("Elements of matrix:");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
