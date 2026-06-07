
import java.util.Scanner;

public class demo {
   void sum(int x, int y) {
    int Add = x + y;
    System.out.println(Add);
  }

  void sub(int x, int y) {
    int sub = x - y;
    System.out.println(sub);
  }

  void mul(int x, int y) {
    int Mul = x * y;
    System.out.println(Mul);
  }

  void div(int x, int y) {
    int Div = x / y;
    System.out.println(Div);
  }

  public static void main(String[] argss) {
    Scanner sc = new Scanner(System.in);

    demo obj = new demo();
    String c;
    do {
      System.out.println("Enter two number to do Operation:");
      int x = sc.nextInt();
      int y = sc.nextInt();

      System.out.println("Enter the numbers to operation (1 for add,2 for sub,3 for mul,4 for div):");
      int n = sc.nextInt();

      switch (n) {
        case 1:
          obj.sum(x, y);

          break;
        case 2:
          obj.sub(x, y);

          break;
        case 3:
          obj.mul(x, y);

          break;
        case 4:
          obj.div(x, y);

          break;
        default:
          System.err.println("Number not in range:");
      }
      System.out.print("Do you want next operation (y/n): ");
      c = sc.next();

    } while (c.equalsIgnoreCase("y"));
    sc.close();
  }
}


// import java.util.Scanner;

// public class demo {

//     void sum(int x, int y) {
//         System.out.println("Sum = " + (x + y));
//     }

//     void sub(int x, int y) {
//         System.out.println("Sub = " + (x - y));
//     }

//     void mul(int x, int y) {
//         System.out.println("Mul = " + (x * y));
//     }

//     void div(int x, int y) {
//         if (y != 0)
//             System.out.println("Div = " + (x / y));
//         else
//             System.out.println("Division by zero not allowed");
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         demo obj = new demo();
//         String c;

//         System.out.print("Enter two numbers: ");
//             int x = sc.nextInt();
//             int y = sc.nextInt();
//         do {
            

//             System.out.print("1-Add 2-Sub 3-Mul 4-Div: ");
//             int n = sc.nextInt();

//             switch (n) {
//                 case 1: obj.sum(x, y); break;
//                 case 2: obj.sub(x, y); break;
//                 case 3: obj.mul(x, y); break;
//                 case 4: obj.div(x, y); break;
//                 default: System.out.println("Invalid choice");
//             }

//             System.out.print("Do you want next operation (y/n): ");
//             c = sc.next();

//         } while (c.equalsIgnoreCase("y"));

//         sc.close();
//     }
// }
