package conditionalstatements;
// 1. Accept age from user and check if he/she is eligible for license or not?

import java.util.Scanner;

public class EligibleForLicense {

	public static void main(String[] args) {
		int age;

		Scanner sc = new Scanner(System.in); 

		System.out.println("Enter age: ");

		age = sc.nextInt();

		if(age < 18)

		System.out.println("Not Eligible to get a license");

		else

		System.out.println("Eligible to get license");

		}
}
