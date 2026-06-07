// Write a program to Demonstrate the constructor

public class ConstructorDemo {
    int id;
    String name;

    public ConstructorDemo(int i, String n) {
        id = i;
        name = n;
    }

    void display() {

        System.out.println("ID: " + id + "\t Name: " + name);
    }

    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo(100, "shyaam");
    }
}