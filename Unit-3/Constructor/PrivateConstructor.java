package Constructor;

public class PrivateConstructor {
    String name;
    int age;

    private PrivateConstructor() {
        name = "Ram";
        age = 20;
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println();
    }
    public static void main(String[] args) {
        PrivateConstructor obj=new PrivateConstructor();

    }
}
class NewClass{
    public static void main(String[] args) {
        // PrivateConstructor obj1=new PrivateConstructor();
        // cannot access private constructor here beacuse it is outside of Private constructor class
    }
}
