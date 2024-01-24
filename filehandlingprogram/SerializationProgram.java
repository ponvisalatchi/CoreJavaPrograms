package filehandlingprogram;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationProgram {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Employee employee = new Employee(30, "Pon Visalatchi", "Programmer");
		
		FileOutputStream outputStream = new FileOutputStream("C:\\Java\\serial.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(employee);
		objectOutputStream.flush();
		System.out.println("Converted emp obj into byte stream");
	}

}
