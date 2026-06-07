import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List <String> list = new ArrayList<String>();
        list.add("Watermelon");
        list.add("Haha");
        list.add("hehe");
        System.out.println(list);
        for (String name : list) {
            System.out.println(name);
        }
    }
}
