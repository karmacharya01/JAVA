import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {

	String name;
	float salary;

	Student(String name, float salary) {
		this.name = name;
		this.salary = salary;
	}
}

class ComparatorSalary implements Comparator<Student> {
	public int compare(Student obj1, Student obj2) {
		if (obj1.salary < obj2.salary)
			return 1;
		return -1;
	}
}

public class ComparatorDemo {
	public static void main(String[] args) {
		ArrayList<Student> studList = new ArrayList<Student>();

		studList.add(new Student("Abhiraj", 50000.61f));
		studList.add(new Student("Raj", 10000.55f));
		studList.add(new Student("Ananya", 70000.55f));
		studList.add(new Student("Ram", 20000.56f));
		studList.add(new Student("Kabi", 80000.89f));

		Comparator<Student> com = new ComparatorSalary();

		Collections.sort(studList, com);

		for (Student stud : studList) {
			System.out.println(stud.name + " --> " + stud.salary);
		}
	}

}
