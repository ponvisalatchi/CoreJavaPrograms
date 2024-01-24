package collectionframework;
import java.util.*;
public class QueueProgram {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		queue.add("Milky Bar");
		queue.offer("Kit Kat");
		queue.offer("Dairy Milk");
		queue.offer("Munch");
		queue.offer("Lollypop");
		System.out.println("Queue: "+queue);
		System.out.println("Head of Queue: "+queue.element());
		System.out.println("Remove: "+queue.remove());
		System.out.println("Queue: "+queue);
		System.out.println("Remove: "+queue.poll());
		System.out.println("Queue: "+queue);


	}

}
