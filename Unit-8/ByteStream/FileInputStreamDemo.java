import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class FileInputStreamDemo{
    public static void main(String[] args) {
        try {
            FileInputStream obj=new FileInputStream("E:\\file1.txt");
            int i=0;
            while((i=obj.read())!= -1){
                System.out.println((char)i);
            }
            obj.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}