public class ExceptionExample {
    public static void main(String[] args) {

        try {
            String s = null;
            System.out.println(s.length()); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception handled");
        }

        try {
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception handled");
        }
    }
}