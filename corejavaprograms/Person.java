package corejavaprograms;

public class Person {
	 int id;
	 String name;
	 MyDate dob;

	 public Person()
	 {
		 id = 29;
		 name = "Pon Visalatchi";
		 dob = new MyDate();

	 }
	 public Person(int id,String name,MyDate dob)
	 {
		 this.id= id;
		 this.name = name;
		 this.dob = dob;
		 }
	 public void display()
	 {

		 System.out.println("Id: "+id);
		 System.out.println("Name :"+name);
		 dob.display();
		 }
	 public static void main(String[] args) {

	// TODO Auto-generated method stub

		 }
	 }
