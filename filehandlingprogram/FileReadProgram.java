package filehandlingprogram;

import java.io.FileReader;
import java.io.IOException;

public class FileReadProgram {

	public static void main(String[] args) throws IOException {
		FileReader reader=new FileReader("C:\\abc\\pons.txt");
		int i;
		while((i=reader.read())!=-1)
		{
			System.out.print((char)i);
		}
		reader.close();
		

	}

}
