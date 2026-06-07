 import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        try {
            FileInputStream obj = new FileInputStream("E:\\file2.txt");
            BufferedInputStream obj2 = new BufferedInputStream(obj);
            int i = 0;
            while ((i = obj.read()) != -1) {
                System.out.println((char) i);
            }
            obj.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
