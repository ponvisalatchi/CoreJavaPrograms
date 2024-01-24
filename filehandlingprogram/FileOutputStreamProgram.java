package filehandlingprogram;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamProgram {

	public static void main(String[] args) throws IOException {
		FileOutputStream outputStream=new FileOutputStream("C:\\Java\\pon.txt",true);
		String str=" by Pon Visalatchi K";
		byte bArray[]=str.getBytes();
		outputStream.write(bArray);
		outputStream.close();
		System.out.println("File Created");
		

	}

}
