import java.util.PriorityQueue;

public class PQ5 {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue();
		queue.add("Black");
		queue.add("White");
		queue.add("Red");
		queue.add("Green");
		queue.add("Blue");
		
		System.out.println("Elements of the Priority Queue:"+queue);
		queue.clear();
		System.out.println("After removing all elements :"+queue);
	}

}
