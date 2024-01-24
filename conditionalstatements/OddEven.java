package conditionalstatements;
//2. Accept a number from user and check whether it is even or odd number

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = reader.nextInt();

		if (num % 2 == 0)
			System.out.println(num + " is even");
		else
			System.out.println(num + " is odd");

	}

}
