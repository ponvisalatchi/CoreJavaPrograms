package corejavaprograms;

public class Employee extends Person {
	float WorkingDays,perDay,salary;
	public Employee() 
	{
		super();
		WorkingDays = 20;
		perDay = 220;
		}
public Employee(int id, String name, MyDate dob, float workingDays, float perDay)

	 {

		 super(id,name,dob);

		 this.WorkingDays = workingDays;
		 this.perDay = perDay;

	 }

	 

	 public void Calculate()

	 {

		 salary = WorkingDays * perDay;

	 }

	 

	 @Override //overriding display() from Person class
	 public void display()

	 {

		 super.display();

		 System.out.println("Salary :"+salary);
	 }


	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
