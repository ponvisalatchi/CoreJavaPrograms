package filehandlingprogram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class DeserializationProgram {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream objInputStream=new ObjectInputStream(new FileInputStream("C:\\Java\\serial.txt"));
		Employee employee=(Employee) objInputStream.readObject();
		System.out.println(employee);
		objInputStream.close();


		// TODO Auto-generated method stub

	}

}
