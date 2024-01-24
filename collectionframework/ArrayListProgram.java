package collectionframework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ArrayListProgram {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("Singaravelan");
		list.add(100);
		list.add(23.23);
		//list.add(null);
		list.add(true);
		System.out.println("List of Elements: "+list);
		
		ArrayList<String> list2=new ArrayList<>();
		list2.add("Pon Visalatchi");
		list2.add("Kamatchi");
		list2.add("Sanjai");
		//list2.add(null);
		list2.add("Aakash");
		System.out.println("Generic Elements: "+list2);
		
		System.out.println("Iterating list using iterator interface: ");
		Iterator<String> iterator= list2.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("Itersting list using for each loop: ");
		for(String string:list2) {
			System.out.println(string);
		}
		
		System.out.println("After Sorting: ");
		Collections.sort(list2);
		for(String string:list2) {
			System.out.println(string);
		}
	}

}
