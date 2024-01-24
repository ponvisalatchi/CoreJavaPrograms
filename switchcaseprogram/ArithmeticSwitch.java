package switchcaseprogram;
import java.util.Scanner;
//1. Enter 2 numbers:Enter your choice. + for add - for sub * for mul / for div

public class ArithmeticSwitch {

	public static void main(String[] args) {
        int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Two Number: ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		char choice;
		System.out.println("Enter your Choice. Press\n + for ADDITION\n - for SUBRACTION\n * for MULTIPLICATION\n / for DIVISION");
		choice=sc.next().charAt(0);
		switch(choice)
		{
		case '+': System.out.println("ADDITION: " +(n1+n2));
		break;
		case '-': System.out.println("SUBRACTION: " +(n1-n2));
		break;
		case '*': System.out.println("MULTIPLICATION: " +(n1*n2));
		break;
		case '/': System.out.println("DIVISION: 30" +(n1/n2));
		break;
		default: System.out.println("InValid Choice");
		}
	
	}

}
