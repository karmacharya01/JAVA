import java.util.*;

class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class SortById implements Comparator<Student> {

    public int compare(Student a, Student b) {
        return a.id - b.id;
    }
}

public class IteratorComparatorExample {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(3,"Ram"));
        list.add(new Student(1,"Hari"));
        list.add(new Student(2,"Sita"));

        Collections.sort(list,new SortById());

        Iterator<Student> it = list.iterator();

        while(it.hasNext()) {
            Student s = it.next();
            System.out.println(s.id + " " + s.name);
        }
    }
}