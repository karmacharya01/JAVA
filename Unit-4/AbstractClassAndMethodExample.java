public abstract class AbstractClassAndMethodExample {
    abstract void sum();

    public static void main(String[] args) {
        InnerAbstractClass obj = new InnerAbstractClass();
        obj.sum();
        obj.display();
    }

}

class InnerAbstractClass extends AbstractClassAndMethodExample {
    void sum() {
        int a = 5, b = 3, c;
        c = a + b;
        System.out.println(c);
    }

    void display() {
        System.out.println("hello");
    }
}