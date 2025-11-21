import java.util.PriorityQueue;

public class PQ3 {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue();
		queue.add("Black");
		queue.add("White");
		queue.add("Red");
		System.out.println("PriotyQueue 1 :"+queue);
		
		
		PriorityQueue<String> queue1 = new PriorityQueue();
		queue1.add("Pink");
		queue1.add("Blue");
		queue1.add("Purple");
		System.out.println("PriotyQueue 2 :"+queue1);
		
		queue.addAll(queue1);
		System.out.println("NewPriotyQueue :"+queue);
		
		
		
	}

}
