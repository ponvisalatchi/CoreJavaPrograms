package java8features;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWithMap {

	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<>();
		marks.add(89);
		marks.add(56);
		marks.add(99);
		marks.add(56);
		marks.add(30);
		System.out.println("Marks before grace: "+marks);
		List<Integer> updatedMarks=marks.stream().map(i->i+10).collect(Collectors.toList());
		System.out.println("Marks after grace: "+updatedMarks);
		

	}

}
