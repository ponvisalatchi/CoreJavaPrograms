package objectexample;

public class AutoboxingUnboxingExample {

	public static void main(String[] args) {
		int a=50;
		Integer objInt1=new Integer(a);
		Integer objInt2=a;
		Integer objInt3=new Integer(90);
		int b=objInt3;
		System.out.println(a+" "+objInt2);
		System.out.println(b+" "+objInt3);
		// TODO Auto-generated method stub

	}

}
