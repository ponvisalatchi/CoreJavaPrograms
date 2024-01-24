package designpatterns;

interface Prototype{
	public Prototype getClone();
}

class Employee implements Prototype{
	private int id,age;
	private String name;
	private float salary;
	public Employee(int id, int age, String name, float salary) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public Prototype getClone() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

public class PrototypePatternProgram {

	public static void main(String[] args) {
		Employee employee=new Employee(30,23,"Pon Visalatchi K",50000);
		System.out.println(employee);
		Employee employee2=(Employee) employee.getClone();
		System.out.println(employee2);

	}

}
