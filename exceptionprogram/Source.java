package exceptionprogram;

public class Source {
	public static void checkAge(int age) throws AgeValidException
	{
		if(age>=15)
			System.out.println("Valid");
		else
			throw new AgeValidException("Not Valid");
	}

	public static void main(String[] args) {
		try
		{
			checkAge(22);
		}
		catch(AgeValidException e)
		{
			e.printStackTrace();
		}
		System.out.println("Rest of code");

	}

}
