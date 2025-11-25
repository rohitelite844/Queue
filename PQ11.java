import java.util.PriorityQueue;

public class PQ11 {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue();
		queue.add("Black");
		queue.add("White");
		queue.add("Red");
		queue.add("Green");
		queue.add("Blue");
		
		System.out.println("Elements of the Priority Queue :"+queue);
		
		String pqstring = queue.toString();
		
		System.out.println("String representation of the Priority Queue :"+pqstring);
	}

}
