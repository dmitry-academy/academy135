package by.academy.package12;

public class Box<T extends Animal & Cloneable> {

	private T[] items;
	private int currentIndex = 0;

	@SuppressWarnings("unchecked")
	public Box() {
		super();
		this.items = (T[]) new Animal[10];
	}

	public T get(int index) {
		return items[index];
	}

	public void addItem(T item) {

		if (items == null) {
			items = (T[]) new Animal[10];
		}
		
		if (currentIndex >= items.length) {
			grow();
		}
		items[currentIndex++] = item;
	}

	private void grow() {
		T[] ts = (T[]) new Animal[items.length * 2 + 1];
		T[] temp = ts;
		System.arraycopy(items, 0, temp, 0, items.length);
		items = temp;
	}

	public void sleepAll() {
		for (int i = 0; i < items.length; i++) {
			if (items[i] != null) {
				items[i].sleep();
			}
		}
		System.out.println();
	}

	public void walkAll() {
		for (int i = 0; i < items.length; i++) {
			if (items[i] != null) {
				items[i].walk();
			}
		}
		System.out.println();
	}

	public void talkAll() {
		for (int i = 0; i < items.length; i++) {
			if (items[i] != null) {
				items[i].talk();
			}
		}
		System.out.println();
	}

	public void print() {
		for (int i = 0; i < items.length; i++) {
			System.out.print("[" + items[i] + "]");
		}
		System.out.println();
	}

	public void remove() {

		if (currentIndex == 0) {
			return;
		}
		items[--currentIndex] = null;
	}

	public void remove(int index) {
		if (items == null || currentIndex == 0) {
			return;
		}

		if (index >= 0 && index < currentIndex) {
			items[index] = null;
			System.arraycopy(items, index + 1, items, index, currentIndex - index);
			currentIndex--;
		} else {
			return;
		}
	}
}
