public class ExceptionTryCatchDemo {
    public static void main(String[] args) {
        int a=10,b=0,c;
       
        try {
            c=a/b;
            System.out.println("This will not be printed");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero"+e.getMessage());
        }finally{
            System.out.println("Final block");
        }
            try {
                int arr[]={10,20,30,40};
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array out of index");
                System.err.println(e.getMessage());
            }
    }
}
