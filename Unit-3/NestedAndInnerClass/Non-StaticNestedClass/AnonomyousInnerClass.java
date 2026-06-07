public class AnonomyousInnerClass {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}

class A {
    void display() {
        System.out.println("Super Class");
    }
}

class B {
    A a = new A() {
        void display() {
            System.out.println("Anonymous Inner Class");
        }
    };

    void show() {
        a.display();
    }
}