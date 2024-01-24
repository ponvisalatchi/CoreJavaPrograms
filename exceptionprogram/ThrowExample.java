package exceptionprogram;

public class ThrowExample {
	public static void checkAge(int age)
	{
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
			throw new ArithmeticException("Age is not valid");
			
	}

	public static void main(String[] args) {
		try
		{
			checkAge(15);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("Rest of code");
	}

}
