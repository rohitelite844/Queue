import java.util.PriorityQueue;

public class PQ7 {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue();
		queue.add("Black");
		queue.add("White");
		queue.add("Red");
		System.out.println("PriotyQueue 1 :"+queue);
		
		
		PriorityQueue<String> queue1 = new PriorityQueue();
		queue1.add("Black");
		queue1.add("Blue");
		queue1.add("Red");
		System.out.println("PriotyQueue 2 :"+queue1);
		
		for (String element : queue)
		if(queue1.contains(element)){
			System.out.println("Yes!");
		}
		else {
			System.out.println("no");
		}

	}

}
