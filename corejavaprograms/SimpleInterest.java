package corejavaprograms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleInterest {

	public static void main(String[] args) throws  NumberFormatException, IOException {
		int id;
		String name;
		double principleAmount,rate,year,total;
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter id: ");
		id=Integer.parseInt(reader.readLine());
		System.out.println("Enter Name: ");
		name=reader.readLine();
		System.out.println("Enter Principle amount: ");
		principleAmount=Double.parseDouble(reader.readLine());
		System.out.println("Enter Year: ");
		year=Double.parseDouble(reader.readLine());
		System.out.println("Enter Rate: ");
		rate=Double.parseDouble(reader.readLine());
		total=(principleAmount*year*rate)/100;
		System.out.println("Simple Interest: "+total);

	}

}
