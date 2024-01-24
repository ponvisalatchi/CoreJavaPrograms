package java8features;

interface Addable{
	int add(int a,int b);
}

public class LambaMultiParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addable a1=(x,y)->x+y;
		System.out.println(" Add: "+a1.add(99, 1));
		Addable a2=(int x,int y)->{
				return x+y;
		};
		System.out.println(" Add: "+a2.add(2,2));
		

	}

}
