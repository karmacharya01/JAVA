package Polymorphism;

class ParentClass {
    void display() {
        System.out.println("Parent Class");
    }
}

class DerivedClass extends ParentClass {
    @Override
    void display() {
        System.out.println("Derivrd Class");
    }
}

public class MethodOverRidding {
    public static void main(String[] args) {
        ParentClass obj = new DerivedClass();
        obj.display();
    }
}
