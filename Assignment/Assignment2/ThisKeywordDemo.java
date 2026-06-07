public class ThisKeywordDemo {
    int id;
    String name;

    public ThisKeywordDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + "\t Name: " + name);
    }

    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo(100, "shyaam");
    }
}
