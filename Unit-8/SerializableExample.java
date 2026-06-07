import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerializableDemo implements Serializable {
    int id;
    String name;
    int age;

    SerializableDemo(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class SerializableExample {
    public static void main(String[] args) {
        try {
            SerializableDemo obj = new SerializableDemo(1, "Ram", 20);

            FileOutputStream obj1 = new FileOutputStream("E:\\file4.txt");
            ObjectOutputStream obj2 = new ObjectOutputStream(obj1);

            obj2.writeObject(obj);
            obj2.close();

            System.out.println("Data inserted successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
  