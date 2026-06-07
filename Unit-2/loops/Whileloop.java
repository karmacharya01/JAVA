package loops;

import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        int i = 0;
        System.out.print("enter the number you want to print:");
        try (Scanner abc = new Scanner(System.in)) {
            int n = abc.nextInt();

            while (i < n) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}
