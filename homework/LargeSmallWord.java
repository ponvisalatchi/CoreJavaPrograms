package homework;
//5.program to find out the largest and smallest word in the string


public class LargeSmallWord {

	public static void main(String[] args) {
		String s = "Pon Visalatchi is a beautiful girl";
        String[] strArray = s.split(" ");
        String small = strArray[0];
        String large = strArray[0];
        for(int i = 1; i < strArray.length; i++){
            if(strArray[i].length() < small.length()){
                small = strArray[i];
            }
        }
        for(int i = 1; i < strArray.length; i++){
            if(strArray[i].length() > large.length()){
                large = strArray[i];
            }
        }
        System.out.println(small);
        System.out.println(large);
	}
}