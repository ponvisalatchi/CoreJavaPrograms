package conditionalstatements;
//3. Accept 3 numbers from user and display greatest number
import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		int x, y, z;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		x = s.nextInt();
		System.out.print("Enter the second number: ");
		y = s.nextInt();
		System.out.print("Enter the third number: ");
		z = s.nextInt();
		if (x > y) {
			if (x > z) {
				System.out.println("Largest number: " + x);
			} else {
				System.out.println("Largest number: " + z);
			}
		} else {
			if (y > z) {
				System.out.println("Largest number: " + y);
			} else {
				System.out.println("Largest number: " + z);
			}
		}
	}

}
