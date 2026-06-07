import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("Abhiraj");
        set.add("Rohit");
        set.add("Alka");
        set.add("Shaan");
        set.add("Bipin");

        set.add("Abhiraj");
        System.out.println(set);
        System.out.println();

        for (int i = 0; i < set.size(); i++)
            System.out.println(set);

        System.out.println();
        Set sortedSet = new TreeSet(set);
        Iterator itr = sortedSet.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
