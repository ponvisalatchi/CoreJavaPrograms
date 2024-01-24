package multithreading;

public class PriorityProgram extends Thread {
	

	public static void main(String[] args) {
		PriorityProgram p1=new PriorityProgram();
		PriorityProgram p2=new PriorityProgram();
		p1.setName("Karthika");
		p2.setName("Devi");
		p1.setPriority(MIN_PRIORITY);
		p2.setPriority(MAX_PRIORITY);
		p1.start();
		p2.start();
		}

	@Override
	public void run() {
		System.out.println("Thread Name: "+getName()+ "Thread Priority: "+getPriority());
	}

}
