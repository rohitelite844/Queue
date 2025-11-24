import java.util.PriorityQueue;

public class PQ9 {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.add(60);
		queue.add(70);
		
		
		System.out.println("Original Priority Queue:"+queue);
		queue.poll();
		System.out.println("After remove first element of priorityqueue"+queue);
	}

}
