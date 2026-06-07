package SuperKeyword;

public class SuperkeywordConstructor {
    public static void main(String[] args) {
        SuperClass1 obj = new SuperClass1();
     
    }
}

class SuperClass {
    SuperClass() {
        System.out.println("This parent class");
    }
}

class SuperClass1 extends SuperClass {
    SuperClass1() {
        super();
        System.out.println("This is Child class");
    }
}  