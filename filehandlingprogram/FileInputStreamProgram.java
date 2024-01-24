package filehandlingprogram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileInputStreamProgram {

	public static void main(String[] args) throws IOException {
		FileInputStream inputStream=new FileInputStream("C:\\Java\\pon.txt");
		int i=0;
		while((i=inputStream.read())!=-1)
		{
			System.out.print((char)i);
		}
		inputStream.close();
		
		
	}

}
