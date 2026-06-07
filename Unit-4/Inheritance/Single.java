package Inheritance;

public class Single {
    public static void main(String[] args) {
        SuperClass obj = new DerivedClass();
        obj.show();
        // obj.display();

    }
}

class SuperClass {
    void show() {
        System.out.println("A class");
    }
}

class DerivedClass extends SuperClass {
    // void display() {
    //     System.out.println("B Class");
    // }
}