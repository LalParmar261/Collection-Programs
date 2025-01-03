package collections;

import java.util.PriorityQueue;

public class PriorityQueue1 {
	public static void main(String[] args) {
		System.out.println("Priority Queue");
		
		PriorityQueue<Integer> pQueue1= new PriorityQueue<Integer>();
		PriorityQueue<Integer> pQueue2= new PriorityQueue<Integer>();
		
		pQueue1.offer(8);
		pQueue1.offer(2);
		pQueue1.offer(4);
		pQueue1.offer(1);

		System.out.println("Queue 1: "+pQueue1);
		pQueue2.addAll(pQueue1);
		System.out.println("Queue 2: "+pQueue2);
		
		

	}
}
