import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream obj = new FileOutputStream("E:\\file2.txt");
            BufferedOutputStream obj1 = new BufferedOutputStream(obj);

            String s = "Welcome to Java Programming";
            byte[] b = s.getBytes();

            obj1.write(b);
            obj1.flush();

            obj1.close();
            obj.close();

            System.out.println("Data written to the file successfully");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
