package collectionframework;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Student implements Comparable<Student>{
	int rollno,age;
	String name;
	public Student(int rollno, int age, String name) {
		super();
		this.rollno = rollno;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", age=" + age + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student st)
	{
		if(age==st.age)
			return 0;
		else if(age<st.age)
			return 1;
		else
			return -1;
	}

	
	
}

public class ComparableProgram {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		list.add(new Student(11,20,"Kamatchi"));
		list.add(new Student(16,23,"Pon Visalatchi"));
		list.add(new Student(12,25,"Sarukhan"));
		list.add(new Student(15,26,"Shalini"));
		list.add(new Student(19,28,"Swati"));
		Collections.sort(list);
		System.out.println("List After Sorting: ");
		for(Student student:list) {
			System.out.println(student);
		}
		

	}

}
