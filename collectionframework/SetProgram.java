package collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class SetProgram {

	public static void main(String[] args) {
		Set<String> hashset=new HashSet<>();
		hashset.add("Pons");
		hashset.add("Kamatchi");
		hashset.add("Sarukhan");
		hashset.add("Thirisha");
		hashset.add("Swati");
		hashset.add("Swati");
		hashset.add("Shalini");
		hashset.add(null);
		System.out.println("Implementing HashSet: ");
		for(String string: hashset) {
			System.out.println(string);
		}
		
		LinkedHashSet<String> linkedHashSet= new LinkedHashSet<>();
		linkedHashSet.add("Mango");
		linkedHashSet.add("Apple");
		linkedHashSet.add("Orange");
		linkedHashSet.add("Banana");
		linkedHashSet.add("Mango");
		linkedHashSet.add(null);
		System.out.println("Implementing LinkedHashSet: \n"+linkedHashSet);
		
		TreeSet<String> treeSet=new TreeSet<>();
		treeSet.add("Rose");
		treeSet.add("Jasmine");
		treeSet.add("Lilly");
		treeSet.add("Lotus");
		treeSet.add("Rose");
		System.out.println("Implementing TreeSet: \n"+treeSet);
		
		
		
	}

}
