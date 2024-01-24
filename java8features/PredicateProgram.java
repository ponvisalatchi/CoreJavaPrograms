package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Student{
	int id,age;
	String name;
	public Student(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static List<Student> studentList()
	{
		ArrayList<Student> list=new ArrayList<>();
		list.add(new Student(111,23,"Pon Visalatchi"));
		list.add(new Student(222,20,"Kamatchi"));
		list.add(new Student(333,20,"Sanjai"));
		list.add(new Student(444,15,"Aakash"));
		list.add(new Student(555,45,"Selvi"));
		list.add(new Student(666,48,"Kasiraja"));
		
		return list;
	}
}

public class PredicateProgram {

	public static void main(String[] args) {
		List<Student> list=Student.studentList();
		
		Predicate<Student> p1=s->s.getName().startsWith("S");
		Predicate<Student> p2=s->s.getAge()<20;
		
		boolean b1=list.stream().anyMatch(p2);
		System.out.println("p2 with anyMatch: "+b1);
		
		boolean b2=list.stream().noneMatch(p2);
		System.out.println("p2 with noneMatch: "+b2);
		
		boolean b3=list.stream().allMatch(p2);
		System.out.println("p2 with allMatch: "+b3);
		
		boolean b4=list.stream().anyMatch(p1);
		System.out.println("p1 with anyMatch: "+b4);
		
		boolean b5=list.stream().noneMatch(p1);
		System.out.println("p1 with noneMatch: "+b5);
		
		boolean b6=list.stream().allMatch(p1);
		System.out.println("p1 with allMatch: "+b6);


	}

}
