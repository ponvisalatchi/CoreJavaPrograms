package collectionframework;

import java.util.LinkedList;

public class LinkedListProgram {

	public static void main(String[] args) {
		LinkedList<String> linkedlist=new LinkedList<>();
		linkedlist.add("Lion");
		linkedlist.add("Monkey");
		linkedlist.add("Camel");
		linkedlist.add("Elephant");
		linkedlist.add(0,"Tiger");
		linkedlist.add(null);
		
		for(String string:linkedlist) {
			System.out.println(string);
		}
		
		LinkedList<String> linkedlist2=new LinkedList<>();
		linkedlist2.add("Rose");
		linkedlist2.add("Jasmine");
		linkedlist2.add("Lilly");
		for(String string:linkedlist2) {
			System.out.println(string);
		}
		
		linkedlist.addAll(linkedlist2);
		System.out.println("Adding List2 in List1 :"+linkedlist);
		
		

	}

}
