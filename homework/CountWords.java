package homework;
//3.program to count no. of words in a String


public class CountWords {

	public static void main(String[] args) {
		String s1 = "I'm Pon Visalatchi, I love Myself";
		String splittedString[] = s1.split(" ");
		System.out.println("Count of words: "+splittedString.length);
	}
}