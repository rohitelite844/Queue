import java.util.PriorityQueue;

public class PQ2 {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue();
		queue.add("Black");
		queue.add("White");
		queue.add("Red");
		queue.add("Green");
		queue.add("Blue");
		
		System.out.println("Elements of the Priority Queue:");
		for(String Qu : queue){
			System.out.println(Qu);
		}
		

	}

}
