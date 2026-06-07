

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int a;
        int sum = 0;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the number to check:");
            a = input.nextInt();
        }
        for (int i = 1; i < a; i++) {
            if ((a % i) == 0) {
                sum += i;
            }
        }
        if (a == sum)
            System.out.println("Perfect number");
        else
            System.out.println("Not perfect");
    }

}
