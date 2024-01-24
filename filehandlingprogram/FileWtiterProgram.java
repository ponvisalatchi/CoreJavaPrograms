package filehandlingprogram;

import java.io.FileWriter;
import java.io.IOException;

public class FileWtiterProgram {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter=new FileWriter("C:\\abc\\pons.txt",true);
		fileWriter.write("Pon Visalatchi K");
		fileWriter.close();
		System.out.println("File Created");
		
		

	}

}
