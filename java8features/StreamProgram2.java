package java8features;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamProgram2 {

	public static void main(String[] args) {
		List<String>names=Arrays.asList("PonVisalatchi","Singaravelan","Kamatchi","Selvi","Sanjai","Aakash");
		//create a stream
		Stream<String> allNames=names.stream();
		
		//perform intermediate operation
		Stream<String> longNames=allNames.filter(str->str.length()>7);
		
		//perform terminal operation
		System.out.println("Using ForEach(): ");
		longNames.forEach(str->System.out.println(str));
		
		//single line
		//collect(Collectors.toList()): used to convert stream to list
		List<String> namesCollect=names.stream().filter(str->str.length()>7).collect(Collectors.toList());
		System.out.println("\nUsing Collect(): ");
		
		//forEach to collect the names
		//namesCollect.forEach(str->System.out.println(str));
		namesCollect.forEach(System.out::println);
		

	}

}
