
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("E:\\file3.txt");
            String str = "Hello to FileWriter";
            fileWriter.write(str);
            fileWriter.close();
            System.out.println("Data Written Successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
