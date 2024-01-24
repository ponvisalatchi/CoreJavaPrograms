package exceptionprogram;

public class TryCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=25/0;
			System.out.println(a);	
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("rest of code.....");

	}

}
