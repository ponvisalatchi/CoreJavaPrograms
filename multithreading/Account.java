package multithreading;

public class Account {
	private int balance=3500;

	public int getBalance() {
		return balance;
	}
	public void withdraw(int amount)
	{
		balance=balance-amount;
	}

}
