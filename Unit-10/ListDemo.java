import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Anil");
        list.add("Nawaraj");
        list.add("Ram");
        list.add("Abhiraj");
        System.out.println(list);

        for (String fruit : list)
            System.out.println(fruit);
    }
}
