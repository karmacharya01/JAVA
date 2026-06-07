package Operators;

public class RelationalOperator {
    public static void main(String[] args) {
        int a=10,b=5;
        boolean c;
        c=a<b;
        System.out.println("a < b :"+c);
        c=a>b;
        System.out.println("a > b :"+c);
        c=a<=b;
        System.out.println("a <= b :"+c);
        c=a>=b;
        System.out.println("a >= b :"+c);
        c=a==b;
        System.out.println("a == b :"+c);
        c=a!=b;
        System.out.println("a != b :"+c);
    }
}
