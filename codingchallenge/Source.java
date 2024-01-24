package codingchallenge;
import java.util.Scanner;
import java.util.stream.Collectors;
/*Q.
Your task here is to implement a Java code based on the following specifications. 
Note that your code should match the specifications in a precise manner.
Consider default visibility of classes, data fields and methods unless mentioned otherwise.
Specifications:
class definitions:class Source:
visibility: public
method definition:
validate(String username, String password): method to authenticate username and password(Use custom values for username and password for authentication)
return type: boolean
Task
Create a Source class and implement below given method:
• validate(String username, String password): Use lambda expression to authenticate
username and password(Use custom values "ABC" for username and "DEF" as password for
authentication). Return true if authentication is successful else return false.
Implement using Lambda expressions.

Sample Input:
Alexa coded123

Sample Output:
false
*/
@FunctionalInterface
interface AuthenticateFun{
	boolean authenticate(String username,String Password);
}

public class Source {
	public boolean validate(String username,String password) {
		AuthenticateFun authFun=(u,p)->u.equals("ABC")&&p.equals("DEF");
		return authFun.authenticate(username, password);
	}
	public static void main(String[] args) {
		Source source=new Source();
		Scanner sc=new Scanner(System.in);
		String username="ABC";
		String password="DEF";
		boolean result=source.validate(username, password);
		System.out.println(result);
		
		
	}

}
