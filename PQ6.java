import java.util.PriorityQueue;

public class PQ6 {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue();
		queue.add("Black");
		queue.add("White");
		queue.add("Red");
		queue.add("Green");
		queue.add("Blue");
		
		System.out.println("Elements of the Priority Queue:"+queue);
		int count = queue.size();
		System.out.println("Size of the Priority Queue:"+count);
		

	}

}
