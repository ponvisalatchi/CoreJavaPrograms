package homework;
//4.program to count no. of vowels and consonants from a string


public class CountVowelsConsonants {

	public static void main(String[] args) {
		String line = "I Like Apple";
	    int v = 0, c = 0;
	    line = line.toLowerCase();
	    for (int i = 0; i < line.length(); ++i) {
	      char ch = line.charAt(i);
	      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	        ++v;
	      }
	      else if (ch != ' '){
	        ++c;
	      }
	    }
	    System.out.println("Vowels: " + v);
	    System.out.println("Consonants: " + c);
	  }
}