package collectionframework;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.*;

public class MapProgram {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		map.put("Sun", "Shine");
		map.put("Photo", "Graph");
		map.put("Every", "Day");
		map.put("Grand", "Daughter");
		map.put("Love", "You");
		map.put(null, null);
		System.out.println("Implementing HashMap: ");
		for(Map.Entry<String, String> entry : map.entrySet())
		{
			System.out.println("Connecting: "+entry.getKey()+", Words: "+entry.getValue());
		}
		
		System.out.println(map.get("Photo"));
		
		
		Map<String, String> treeMap=new TreeMap<>();
		treeMap.put("BR01", "Coffee");
		treeMap.put("TE06", "Tea");
		treeMap.put("PS29", "Pasta");
		System.out.println("Implementing TreeMap: ");
		for(Map.Entry<String, String> entry:treeMap.entrySet())
		{
			System.out.println("Code: "+entry.getKey()+", Menu: "+entry.getValue());
		}
		
		
		
		Hashtable<String, String> hashTable=new Hashtable<>();
		hashTable.put("CR51", "Channa Masala");
		hashTable.put("B96", "Biriyani");
		hashTable.put("PS29", "Chicken Rice");
		System.out.println("Implementing HashTable: ");
		for(Map.Entry<String, String> entry:hashTable.entrySet())
		{
			System.out.println("Lunch: "+entry.getKey()+", Menu: "+entry.getValue());
		}

	}

}
