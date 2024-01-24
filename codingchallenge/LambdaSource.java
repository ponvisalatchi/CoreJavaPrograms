package codingchallenge;
/*Coding Challenge:
Your task here is to implement a Java code based on the following specifications. Note that your code should match the specifications in a precise manner. Consider default visibility of classes, data fields and methods unless mentioned otherwise.
Specifications:
class definitions:class Source:
visibility: public
method definition:
insertSpace(String s): method that uses lambda expression to format a given string, where a space is inserted between each character of string.
return type: String
Task
Create a Source class and implement below given method:
• insertSpace(String s): Use lambda expression to format a given string, where a space is inserted between each character of string
Implement using Lambda expressions.
Sample Input:
capgemini

Sample Output:
c a p g e m i n i*/

import java.util.Scanner;
import java.util.stream.Collectors;
/* Pon Visalatchi K */

/*@FunctionalInterface
interface Space {
	String insertSpace(String s);
}*/

public class LambdaSource {
	public String insertSpace(String s) {
		return s.chars().//converting into characters
				mapToObj(ch->(char)ch+" ")//adding space to each other
				.collect(Collectors.joining());//joining characters
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		LambdaSource s1=new LambdaSource();
		String result=s1.insertSpace(str);

		
		System.out.println(result);
		sc.close();

	}

}
