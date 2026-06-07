import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(102);
        linkedList.add(100);
        linkedList.add(101);
        linkedList.add(105);
        linkedList.add(107);
        System.out.println(linkedList);
        Iterator iterator = linkedList.iterator();
        System.out.println("After Looping.");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
