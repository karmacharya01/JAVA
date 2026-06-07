import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.add(10);
        link.add(20);
        link.add(30);
        System.out.println(link);
        Iterator it = link.iterator();
        System.out.println("After Looping: ");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
