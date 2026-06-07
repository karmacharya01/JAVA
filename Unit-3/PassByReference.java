public class PassByReference {
    int a = 100;

    void update(int b) {
        a = a + b;
    }

    public static void main(String[] args) {
        PassByReference obj = new PassByReference();
        System.out.println("Before change:" + obj.a);
        PassByReference obj1 = obj;

        obj1.update(10000);
        System.out.println("After change:" + obj.a);

    }
}
