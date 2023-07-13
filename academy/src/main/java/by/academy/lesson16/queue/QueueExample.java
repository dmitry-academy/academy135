package by.academy.lesson16.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");

		System.out.println("peek: " + queue.peek());

		String town;
		while ((town = queue.poll()) != null) {
			System.out.println(town);
		}
		System.out.println("size after polling: " + queue.size());
	} 
}