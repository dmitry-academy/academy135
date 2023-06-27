package by.academy.package11;

public class Box {

	private Integer[] items;
	private int currentIndex = 0;

	public Box() {
		super();
		items = new Integer[10];
	}

	public Integer get(int index) {
		return items[index];
	}

	public void addItem(Integer item) {

		if (items == null) {
			items = new Integer[10];
		}

		if (currentIndex >= items.length) {
			grow();
		}
		items[currentIndex++] = item;
	}

	private void grow() {
		Integer[] temp = new Integer[items.length * 2 + 1];
		System.arraycopy(items, 0, temp, 0, items.length);
		items = temp;
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
