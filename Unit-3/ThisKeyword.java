class Watermelon {
    int id;
    String name;
    int age;

    Watermelon(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("ID:" + id + "\t Name:" + name + "\t Age:" + age);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Watermelon Student = new Watermelon(100, "Watermelon", 19);
        Watermelon Student1 = new Watermelon(101, "Watermelon Kharbuja", 18);
        Student.display();
        Student1.display();

    }

}
