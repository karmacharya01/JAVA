package Polymorphism;

public class MethodOverLoading {
    void display() {
        System.out.println("NO Parameter");
    }

    void display(int a) {
        System.out.println("A:" + a);
    }

    void display(int a, int b) {
        System.out.println("A+B:" + (a + b));
    }

    public static void main(String[] args) {
        MethodOverLoading objLoading = new MethodOverLoading();
        objLoading.display();
        objLoading.display(100);
        objLoading.display(100, 20);
    }

}
