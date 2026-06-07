
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapDemo {
    public static void main(String[] args) {
        Map <Integer,String> list = new HashMap<Integer,String>();
        list.put(1, "Abc");
        list.put(2, "gdd");
        list.put(3, "sdf");
        System.out.println(list.size());
        list.remove(3);
        System.out.println(list);
        Set set = list.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()) { 
            HashMap.Entry me = (HashMap.Entry)it.next();
            System.out.println("Key:"+me.getKey()+" : value"+ me.getValue());
        }
        System.out.println(list.entrySet());
    }
}
