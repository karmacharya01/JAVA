package SuperKeyword;

public class SuperKeyword {
    public static void main(String[] args) {
        SuperClass1 obj = new SuperClass1();
        obj.display();
    }
}

class SupClass {
    int a = 5;
}

class SuperClass1 extends SupClass {
    int a = 10;
    void display() {
        System.out.println(a);
        System.out.println(super.a);    
    }
}