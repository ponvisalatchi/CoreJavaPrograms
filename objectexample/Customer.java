package objectexample;

public class Customer implements Cloneable {
	int id;
	String name,phoneno;
	public Customer()
	{
		super();
	}
	public Customer(int id,String name,String phoneno)
	{
		super();
		this.id=id;
		this.name=name;
		this.phoneno=phoneno;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public static void main(String[] args)throws CloneNotSupportedException{
		Customer customer1 = new Customer(1,"Pon Visalatchi","9876543210");

		Customer customer2 = new Customer(2,"Kamatchi","9987345223");

		System.out.println(customer1);

		System.out.println(customer2);

		Customer customer3=(Customer) customer2.clone();

		System.out.println(customer3);

		// TODO Auto-generated method stub

	}

}
