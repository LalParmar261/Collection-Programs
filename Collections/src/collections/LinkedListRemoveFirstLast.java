package collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListRemoveFirstLast {
	public static void main(String[] args) {
		System.out.println("LinkedList");

		LinkedList<Integer> lk = new LinkedList<>();

		lk.offer(8);
		lk.offer(7);
		lk.offer(9);
		lk.offer(5);
		lk.offer(1);

		System.out.println("original= " + lk);
		lk.pollFirst();
		lk.pollLast();
		System.out.println("Altered= " + lk);

		// Sorting
		Collections.sort(lk);
		System.out.println("Sorted= " + lk);

	}

}
