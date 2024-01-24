package multithreading;

public class ThreadProgram2 implements Runnable {

	@Override
	public void run() {
		while(true)
		{
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Currently executing Thread: "+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		ThreadProgram2 threadProgram2=new ThreadProgram2();
		Thread t1=new Thread(threadProgram2);
		t1.setName("Karthika");
		t1.start();
		
		Thread t2=new Thread(threadProgram2);
		t2.setName("Devi");
		t2.start();
	}
}
