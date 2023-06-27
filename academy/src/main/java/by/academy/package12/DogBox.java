package by.academy.package12;

public class DogBox {

	private Dog[] dogs;
	private int currentIndex = 0;

	public DogBox() {
		super();
		dogs = new Dog[10];
	}

	public Dog getDog(int index) {
		return dogs[index];
	}

	public void addDog(Dog Dog) {

		if (dogs == null) {
			dogs = new Dog[10];
		}

		if (currentIndex >= dogs.length) {
			grow();
		}
		dogs[currentIndex++] = Dog;
	}

	private void grow() {
		Dog[] temp = new Dog[dogs.length * 2 + 1];
		System.arraycopy(dogs, 0, temp, 0, dogs.length);
		dogs = temp;
	}

	public void print() {
		for (int i = 0; i < dogs.length; i++) {
			System.out.print("[" + dogs[i] + "]");
		}
		System.out.println();
	}

	public void remove() {

		if (currentIndex == 0) {
			return;
		}
		dogs[--currentIndex] = null;
	}

	public void remove(int index) {
		if (dogs == null || currentIndex == 0) {
			return;
		}

		if (index >= 0 && index < currentIndex) {
			dogs[index] = null;
			System.arraycopy(dogs, index + 1, dogs, index, currentIndex - index);
			currentIndex--;
		} else {
			return;
		}
	}
}
