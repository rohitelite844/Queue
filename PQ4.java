import java.util.PriorityQueue;

public class PQ4 {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue();
		queue.add("Black");
		queue.add("White");
		queue.add("Red");
		queue.add("Pink");
		System.out.println(queue);
		
		queue.add("Blue");
		System.out.println(queue);

	}

}
