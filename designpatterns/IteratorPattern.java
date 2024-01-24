package designpatterns;
interface Iterator{
	boolean hasNext();
	Object next();
}

interface Container{
	Iterator getIterator();
}

 class CollectionOfNames implements Container{
   public String names[]= {"Kasiraja","Selvi","Pon Visalatchi","Kamatchi","Sanjai","Aakash"};

@Override
public Iterator getIterator() {
	
return new CollectionOfNamesIterator();
}	
   
   public class CollectionOfNamesIterator implements Iterator{
	   int i;

	@Override
	public boolean hasNext() {
		if(i<names.length)
	return true;
		else
			return false;
	}

	@Override
	public Object next() {
		if(this.hasNext()) {
		return names[i++];
	}
	 return null;
   }
  }
}



public class IteratorPattern {

	public static void main(String[] args) {
		CollectionOfNames collectionOfNames=new CollectionOfNames();
		for(Iterator iterator = collectionOfNames.getIterator();iterator.hasNext();) {
			String name=(String)iterator.next();
			System.out.println(name);
		}
	}

}
