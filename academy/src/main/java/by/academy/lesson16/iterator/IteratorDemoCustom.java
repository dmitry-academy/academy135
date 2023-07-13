package by.academy.lesson16.iterator;

public class IteratorDemoCustom {

	public static void main(String[] args) {

		Integer[] arr = { 1, 7, 9 };

		CustomIterator<Integer> iterator = new CustomIterator<>(arr);

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		String[] arr1= { "one", "two", "three" };

		CustomIterator<String> iterator1 = new CustomIterator<>(arr1);

		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
	}

}
