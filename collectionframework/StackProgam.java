package collectionframework;
import java.util.Stack;

public class StackProgam {

	public static void main(String[] args) {
		Stack<String> stack=new Stack<>();
		stack.push("Mother");
		stack.push("Father");
		stack.push("Brother");
		stack.push("Sister");
		stack.push("Uncle");
		stack.push("Mother");
		stack.push(null);
		System.out.println("Stack: "+stack);
		System.out.println("Removing element: "+stack.pop());
		System.out.println("Stack after removing: "+stack);
		System.out.println("Search Mother: "+stack.search("Mother"));
		
		

	}

}
