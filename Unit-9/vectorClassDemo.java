import java.util.Iterator;
import java.util.Vector;

public class vectorClassDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println("Initial Capicity: "+ v.capacity());
        v.add("Watermelom");
        v.add(1);
        v.add(34.34);
        System.out.println(v);
        System.out.println(v.size());
        for (int i = 0; i < v.size(); i++) {
            System.out.println("Elements: "+v.get(i));
        }
        System.out.println();
        Iterator it = v.iterator();
        while (it.hasNext()) { 
            System.out.println(it.next());
        }

    }
}