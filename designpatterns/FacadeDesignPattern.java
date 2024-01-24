package designpatterns;

import java.util.Scanner;

interface MobileShop {
	void modelNo();

	void price();
}

class IPhone implements MobileShop {

	@Override
	public void modelNo() {
		// TODO Auto-generated method stub
		System.out.println("IPhone6");
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("Rs.70000");
	}

}

class Samsung implements MobileShop {

	@Override
	public void modelNo() {
		// TODO Auto-generated method stub
		System.out.println("SamsungG7");
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("Rs.50000");
	}

}

class Realme implements MobileShop {

	@Override
	public void modelNo() {
		// TODO Auto-generated method stub
		System.out.println("RealmeGt8");
	}

	@Override
	public void price() {
		System.out.println("Rs.30000");
	}

}

class ShopKeeper {
	private IPhone iPhone;
	private Samsung samsung;
	private Realme realme;

	public ShopKeeper() {
		iPhone = new IPhone();
		samsung = new Samsung();
		realme = new Realme();
	}

	public void saleIPhone() {
		iPhone.modelNo();
		iPhone.price();
	}

	public void saleSamsung() {
		samsung.modelNo();
		samsung.price();
	}

	public void saleRealme() {
		realme.modelNo();
		realme.price();
	}
}

public class FacadeDesignPattern {

	public static void main(String[] args) {
		int choice;

		ShopKeeper shopkeeper = new ShopKeeper();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your choice.press\n 1.IPhone\n 2.Samsung\n 3.Realme\n 4.Exit\n");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				shopkeeper.saleIPhone();
				break;
			case 2:
				shopkeeper.saleSamsung();
				break;
			case 3:
				shopkeeper.saleRealme();
				break;
			default:
				System.out.println("Invalid choice");
			}
		} while (choice != 4);

	}

}
