package loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] argss) {
        System.out.print("Enter the number you want to print:");
        try (Scanner abc = new Scanner(System.in)) {
            int n = abc.nextInt();
            for (int i = 1; i <= 10; i++) {
                int mul = n * i;
                System.out.println(n + "*" + i + "=" + mul);
            }
        }
    }
}