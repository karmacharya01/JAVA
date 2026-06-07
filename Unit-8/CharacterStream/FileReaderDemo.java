import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("E:\\file3.txt");
            int i;

            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }

            fileReader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
