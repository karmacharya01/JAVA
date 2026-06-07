import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeSerializationExample {
    public static void main(String[] args) {
        SerializableDemo obj2 = null;
        try {
            FileInputStream obj = new FileInputStream("E:\\file4.txt");
            ObjectInputStream obj1 = new ObjectInputStream(obj);
            obj2 = (SerializableDemo) obj1.readObject();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(obj2.id);
        System.out.println(obj2.name);
        System.out.println(obj2.age);
    }
}
  