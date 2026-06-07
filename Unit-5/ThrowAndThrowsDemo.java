import java.util.Scanner;

public class ThrowAndThrowsDemo {

    void readAge(int age) throws Exception {
        if (age < 15 || age > 60) {
            throw new Exception("Invalid age");
        } else {
            System.out.println("Your Age: " + age);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        ThrowAndThrowsDemo demo = new ThrowAndThrowsDemo();
        try {
            demo.readAge(age);
        } catch (Exception e) {
            System.out.println("Age must be between 15 and 60. Age entered is: " + age);
        }

       sc.close();      
    }
}
