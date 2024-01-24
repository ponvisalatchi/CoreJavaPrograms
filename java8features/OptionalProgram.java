package java8features;
import java.util.Optional;

public class OptionalProgram {

	public static void main(String[] args) {
		String arr[]=new String[5];
		//arr[3]="Pon Visalatchi K";
		Optional<String> result= Optional.ofNullable(arr[3]);
		if(result.isPresent()) {
			String upperCase=arr[3].toUpperCase();
			System.out.println(upperCase);
		}
		else
		{
			System.out.println("String is not present at 3rd");
		}

	}

}
