package abstraction;

public class InterfaceImplement implements Addable,Printable {

	public static void main(String[] args) {
		InterfaceImplement impl=new InterfaceImplement();
		impl.print();
		Addable.add(27,4);
		impl.Mul(45,6);
		impl.div(245, 8);
		
		// TODO Auto-generated method stub

	}
	@Override
	public void print() {
		float r=20;
		System.out.println("Area: "+(PI*r*r));
	}
	@Override
	public void div(double a,double b) {
		System.out.println("Div: "+(a/b));
		
	}
	@Override
	public void show() {
		Addable.super.show();
	}

}
