package Operators;

public class LogicalOperator {
    public static void main(String[] args) {
        int a = 20, b = 10, c = 5;
        System.out.println("And Operator:");
        System.out.println((a < b) && (b < c));
        System.out.println((a > b) && (b > c));
        System.out.println();

        System.out.println("OR Operator:");
        System.out.println((a < b) || (b < c));
        System.out.println((a > b) || (b > c));
        System.out.println();

        System.out.println("Not Operator:");
        System.out.println(!(a == b));
        System.out.println(!(a > b));
        System.out.println();

    }
}
