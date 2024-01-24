package corejavaprograms;
//1. Person(id,name,dob) <- Employee(workingDays,perDay,salary) <- SalesPerson(sales,commission)
//if sale 
//90% then commission 20% of salary
//75% then commission 10% of salary
//60% then commission 5% of salary
//calculate commission and total salary

public class Test {

	public static void main(String[] args) {
	
		/*

		 * person1.person1 = new person();

		 * person.display();

		 * Person person2 = new Person(102,"", new MyDate(24,4,2000));

		 

		

		/*Employee1 employee1 = new Employee1();

		employee1.Calculate();

		employee1.display();

		

		Employee1 employee2 = new Employee1(29, "", new MyDate(19, 9, 2001), 18, 1670);

		employee2.Calculate();

		employee2.display();*/
		SalesPerson emp1 = new SalesPerson();

		emp1.Calculate();

		emp1.display();

		

		SalesPerson emp2 = new SalesPerson(29, "Pon Visalatchi", new MyDate(29, 9, 2006), 20, 3000, 40);

		emp1.Calculate();

		emp1.display();


	}

}
