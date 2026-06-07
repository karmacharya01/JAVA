import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream obj=new FileOutputStream("E:\\file1.txt");
            String a="WaterMelon";
            byte b[]=a.getBytes();
            obj.write(b);
            obj.close();
            System.out.println("Written Successfuly.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
