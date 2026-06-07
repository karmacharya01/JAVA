import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        Iterator it = arrayList.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
