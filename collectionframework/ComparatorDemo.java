package collectionframework;

import java.util.*;

class Employee{
	int id,salary;
	String name;
	public Employee(int id, int salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}
}

class SalaryComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if(e1.salary==e2.salary)
			return 0;
		else if(e1.salary<e2.salary)
			return 1;
		else
			return -1;
	}
}

class NameComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.name.compareTo(e2.name);
	}
}


public class ComparatorDemo {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(201,20000,"Pon Visalatchi"));
		list.add(new Employee(301,35000,"Kamatchi"));
		list.add(new Employee(205,24500,"Shalini"));
		list.add(new Employee(309,42000,"Swati"));
		list.add(new Employee(208,33000,"Thirisha"));
		System.out.println("Sorting on the basis of salary: ");
		Collections.sort(list,new SalaryComparator());
		for(Employee employee : list) {
			System.out.println(employee);
		}
		
		System.out.println("Sorting on the basis of name: ");
		Collections.sort(list,new NameComparator());
		for(Employee employee : list) {
			System.out.println(employee);
		}
	}
}

