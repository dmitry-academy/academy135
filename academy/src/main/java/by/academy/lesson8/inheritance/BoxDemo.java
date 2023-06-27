package by.academy.lesson8.inheritance;

public class BoxDemo {

	public static void main(String[] args) {
		Box box = new Box(1, 2, 3);
		System.out.println(box);

		ColorBox colorBox = new ColorBox(1, 2, 3, "Red");
		System.out.println(colorBox);

		HeavyBox heavyBox = new HeavyBox(1, 2, 3, 4);
		System.out.println(heavyBox);
		
		System.out.println(heavyBox.getHeigth());

	}

}
