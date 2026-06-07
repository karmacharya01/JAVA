
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListClassDemo {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<String>();
        arrayList.add("Watermelon");
        arrayList.add("ABc");
        arrayList.add("BCD");
        System.out.println("Size Of the ArrayList: "+ arrayList.size());
        Collections.sort(arrayList);
        Iterator  it = arrayList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
