package Constructor;

class Student {
    int id;
    String name;
    int age;

    Student(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println("ID:" + id + "\t Name:" + name + "\t Age:" + age);
    }
}

public class ParametrizedConstructor {
    public static void main(String[] args) {
        Student student = new Student(100, "Ram", 20);
        Student student2 = new Student(101, "Shyam", 22);
        student.display();
        student2.display();
    }
}
