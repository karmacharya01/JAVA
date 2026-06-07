package SuperKeyword;

public class SuperKeywordMethod {
    public static void main(String[] args) {
        SuperClass1 obj = new SuperClass1();
        obj.sum();
    }
}

class SuperClass {
    void sum() {
        int a = 10, b = 20, c;
        c = a + b;
        System.out.println(c);
    }
}

class SuperClass1 extends SuperClass {
    @Override
    void sum() {
        int a = 1, b = 20, c;
        c = a + b;
        super.sum();
        System.out.println(c);
    }
}
