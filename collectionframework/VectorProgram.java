package collectionframework;
import java.util.Vector;
import java.util.Enumeration;

public class VectorProgram {

	public static void main(String[] args) {
		Vector<String> vector=new Vector<>();
		vector.addElement("Note");
		vector.add("Book");
		vector.add("Pen");
		vector.add("Pencil");
		vector.add("Scale");
		vector.add("Eraser");
		vector.add("null");
		
		Enumeration<String> e=vector.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

	}

}
