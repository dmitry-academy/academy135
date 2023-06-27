package by.academy.package12;

public class CatBox {

	private Cat[] cats;
	private int currentIndex = 0;

	public CatBox() {
		super();
		cats = new Cat[10];
	}

	public Cat getCat(int index) {
		return cats[index];
	}

	public void addCat(Cat cat) {

		if (cats == null) {
			cats = new Cat[10];
		}

		if (currentIndex >= cats.length) {
			grow();
		}
		cats[currentIndex++] = cat;
	}

	private void grow() {
		Cat[] temp = new Cat[cats.length * 2 + 1];
		System.arraycopy(cats, 0, temp, 0, cats.length);
		cats = temp;
	}

	public void print() {
		for (int i = 0; i < cats.length; i++) {
			System.out.print("[" + cats[i] + "]");
		}
		System.out.println();
	}

	public void remove() {

		if (currentIndex == 0) {
			return;
		}
		cats[--currentIndex] = null;
	}

	public void remove(int index) {
		if (cats == null || currentIndex == 0) {
			return;
		}

		if (index >= 0 && index < currentIndex) {
			cats[index] = null;
			System.arraycopy(cats, index + 1, cats, index, currentIndex - index);
			currentIndex--;
		} else {
			return;
		}
	}
}
