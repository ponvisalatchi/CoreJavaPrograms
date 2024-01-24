package corejavaprograms;

public class Student {
	int rollNumber;
	String name;
	float phy,chem,maths,total,percent;
	public Student()
	{
		rollNumber=30;
		name="Pon Visalatchi";
		phy=86;
		chem=90;
		maths=89;
	}
	public Student(int rNumber,String name,float phy,float chem,float maths)
	{
		rollNumber=rNumber;
		this.name=name;
		this.phy=phy;
		this.chem=chem;
		this.maths=maths;
	}
	public void calculate()
	{
		total=phy+chem+maths;
		percent=total/3;
	}
	public void display()
	{
		System.out.println("Student Roll Number:" +rollNumber);
		System.out.println("Student Name:" +name);
		System.out.println("Total:" +total);
		System.out.println("Percentage:" +percent);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.calculate();
		student.display();
		Student student1 =new Student(03,"Pon Visalatchi",80,79,90);
		student1.calculate();
		student1.display();

	}

}
