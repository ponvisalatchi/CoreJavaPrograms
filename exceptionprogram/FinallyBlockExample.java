package exceptionprogram;

public class FinallyBlockExample {

	public static void main(String[] args) {
		System.out.println("Case 1: Where exception does'nt occur");;
		try {
			int a=25/5;
			System.out.println("Division: "+a);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("case 1 : finally block always executes");

		}

		

		System.out.println("case 1:rest of code..");

		System.out.println("------------------------------------------");

		System.out.println("\ncase 2: where exception occurs and handled");;

		try {

			String s=null;

			System.out.println(s.length());

		}

		catch(NullPointerException e) {

			e.printStackTrace();

		}
		finally {

			System.out.println("case 2:finally block always executes");

		}

		System.out.println("case 2restof code...");

		System.out.println("--------------------------------------------");

		System.out.println("case 3; where eception occurs but doesn't handled");

		try {

			int a=25/0;

			System.out.println("Div :"+a);

		}

		catch(NullPointerException e) {

			e.printStackTrace();
		}

		finally {

			System.out.println("case 3: finally block always executes" );

		}

		System.out.println("case 3: rest oof code...");

		System.out.println("---------------------------------------------------");

	}



}
	
