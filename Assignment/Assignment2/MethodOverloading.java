public class MethodOverloading {
    void sum(int a) {
        System.out.println(a);
    }

    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.sum(5);
        obj.sum(5, 6);
        obj.sum(5, 6, 9);
    }
}
