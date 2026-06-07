import java.io.*;

public class StudentFile {

    public static void main(String[] args) throws Exception {

        FileWriter fw = new FileWriter("student.txt");

        fw.write("1 Ram Ktm Islington\n");
        fw.write("2 Sita Pokhara NCIT\n");
        fw.write("3 Hari Ktm Patan\n");

        fw.close();

        BufferedReader br = new BufferedReader(new FileReader("student.txt"));

        String line;

        while((line = br.readLine()) != null) {

            if(line.contains("Ktm")) {
                System.out.println(line);
            }
        }

        br.close();
    }
}