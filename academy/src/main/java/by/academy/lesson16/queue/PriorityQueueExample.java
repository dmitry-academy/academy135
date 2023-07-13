package by.academy.lesson16.queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		Queue<String> queue1 = new PriorityQueue<>();
		queue1.offer("1");
		queue1.offer("2");
		queue1.offer("3");
		queue1.offer("4");
		queue1.offer("4");
		System.out.print("Priority queue without Comparable: ");
		while (queue1.size() > 0) {
			System.out.print(queue1.remove() + " ");
		}
		System.out.println();

		PriorityQueue<String> queue2 = new PriorityQueue<>(5, Collections.reverseOrder());
		queue2.offer("1");
		queue2.offer("2");
		queue2.offer("3");
		queue2.offer("4");
		queue2.offer("5");
		System.out.print("Priority queue with Comparator: ");
		while (queue2.size() > 0) {
			System.out.print(queue2.remove() + " ");
		}
	}
}