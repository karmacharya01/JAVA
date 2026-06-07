// Write a java program to to find simple intrest.Using Command line argument to take input

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of principle: ");
        int Principle = input.nextInt();
        System.out.print("Enter the value of rate: ");
        int Rate = input.nextInt();
        System.out.print("Enter the value of time: ");
        int Time = input.nextInt();

        double SimpleIntrest = (Principle * Rate * Time) / 100;

        System.out.println("SimpleIntrest: " + SimpleIntrest);
    }
}
