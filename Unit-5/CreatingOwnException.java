import java.util.Scanner;

public class CreatingOwnException {
    int balance;

    void amountWithdraw(int a) {
        try {
            if (a > balance)
                throw new LessBalance(a, balance); // this is user defined
            balance = balance - a;
            System.out.println("Amount Withdraw Your Balance is :" + balance);
        } catch (LessBalance e) {
            System.out.println("Enter Amount Less than " + balance);
        }
    }

    public static void main(String[] args) {
        CreatingOwnException demo = new CreatingOwnException();
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter the Balance:");
        demo.balance = inputScanner.nextInt();
        System.out.println("Enter the Amount to Withdraw:");
        int a = inputScanner.nextInt();
        demo.amountWithdraw(a);
        
    }

}

class LessBalance extends Exception {
    CreatingOwnException ob = new CreatingOwnException();

    public LessBalance(int a, int b) {
        System.out.println("Your balance is " + b + "and you want to withdraw" + a);
    }

}
