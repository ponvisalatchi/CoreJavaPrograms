package java8features;
import java.util.ArrayList;

public class StreamProgram {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("PonVisalatchi");
		list.add("Kamatchi");
		list.add("Sanjai");
		list.add("Kasiraja");
		list.add("Selvi");
		list.add("Aakash");
		list.add("Rani");
	
		
		//count name with length less than 7
		int count=0;
		for(String string:list) {
			if(string.length()<7)
			{
				count++;
			}
		}
		System.out.println("There are "+count+" strings with length less than 7");
		long count1=list.stream().filter(str->str.length()<7).count();
		System.out.println("There are "+count+" strings with length less than 7");
		

	}

}
