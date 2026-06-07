public class NonStaticNestedInnerOuter {

    int x = 20;

    class Inner {
        void show() {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        NonStaticNestedInnerOuter outer = new NonStaticNestedInnerOuter();

        NonStaticNestedInnerOuter.Inner inner = outer.new Inner();

        inner.show();
    }
}
