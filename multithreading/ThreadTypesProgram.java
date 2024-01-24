package multithreading;

public class ThreadTypesProgram extends Thread {

	public static void main(String[] args) {
		ThreadTypesProgram t1 = new ThreadTypesProgram();
		ThreadTypesProgram t2 = new ThreadTypesProgram();
		ThreadTypesProgram t3 = new ThreadTypesProgram();
		t1.setName("Karthika");
		t2.setName("Devi");
		t3.setName("Karthika Devi");
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}

	@Override
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Functionality of Daemon Thread " + getName());
		} else {
			System.out.println("Functionality of User Thread " + getName());
		}
	}
}
