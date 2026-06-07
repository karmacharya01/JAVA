public class StaticNestedClassOuter {

    static int x = 10;

    static class Inner {
        void show() {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        StaticNestedClassOuter.Inner obj =
                new StaticNestedClassOuter.Inner();
        obj.show();
    }
}
