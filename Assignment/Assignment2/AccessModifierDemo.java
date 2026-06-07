public class AccessModifierDemo {
    public static void main(String[] args) {
        Demo obj = new Demo();

        System.out.println(obj.a); //  public
        System.out.println(obj.b); //  protected (same package)
        System.out.println(obj.c); //  default (same package)
        //  System.out.println(obj.d); //  private (not accessible)

        obj.show(); //  private accessible inside same class
    }
}

class Demo {

    public int a = 10; // public
    protected int b = 20; // protected
    int c = 30; // default
    private int d = 40; // private

    void show() {
        System.out.println("Public: " + a);
        System.out.println("Protected: " + b);
        System.out.println("Default: " + c);
        System.out.println("Private: " + d);
    }
}