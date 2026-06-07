import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set s = new HashSet<>();
        s.add("Watermelon");
        s.add("haha");
        s.add("heheh");
        System.out.println(s);
        for (int i = 0; i < s.size(); i++) {
            System.out.println(s);
        }
        Set sorted = new TreeSet(s);
        Iterator it = sorted.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
