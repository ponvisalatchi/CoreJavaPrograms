package stringexample;

public class StringEx {

	public static void main(String[] args) {
		String s1 = new String("Pon Visalatchi");

		System.out.println(s1);

		

		String str = "Kamatchi";

		System.out.println(str);

		

		String s2 = " ";

		String s3 = "welcome";

		String s4 = "                  String Example            ";

		String s5 = "This is example of split function";

		

		//String methods

		System.out.println("length :"+str.length());
System.out.println("charAt(3) :"+str.charAt(3));

		

		System.out.println("Substring :"+str.substring(3));

		

		System.out.println("Substring :"+str.substring(0,2));

		

		System.out.println("contain c :"+str.contains("c"));

		

		System.out.println("contain x :"+str.contains("x"));

		

		System.out.println("isEmpty :"+str.isEmpty());

		

		System.out.println("isBlank :"+str.isBlank());
System.out.println("indexOf :"+str.indexOf("e",3));

		

		System.out.println("lastIndexOf :"+str.lastIndexOf("e"));

		

		System.out.println("equals :"+str.equals(s3));

		

		System.out.println("equalsIgnoreCase :"+str.equalsIgnoreCase(s3));

		

		System.out.println("concat :"+str.concat(" User"));
System.out.println(str);

		

		str = str.concat(" User");

		

		System.out.println(str);

		

		System.out.println("replace :"+s1.replace('e', 'a'));

		

		System.out.println("uppercase :"+s3.toUpperCase());

		

		System.out.println("lowercase :"+s1.toLowerCase());

		

		System.out.println("uppercase :"+s3.toUpperCase());
		System.out.println("length before trim :"+s4.length());

		s4 = s4.trim();

		

		System.out.println("length after trim :"+s4.length());

		

		String splitedString[] = s5.split(" ");

		System.out.println("count of words :"+splitedString.length);

		

		

		for (String string :splitedString) {

			System.out.println(string);

		}
	}

}
		

