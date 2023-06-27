package by.academy.lesson8;

public class Task2Demo {

	public static void main(String[] args) {

		String s = "qweqweqweqweeeeeeeeeeeeeeeeeeeeeezxcv";// q,w,e

		int counter[] = new int[128];
		int numberOfUnique = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int index = (int) c;

			counter[index]++;
			if (counter[index] == 1) {
				numberOfUnique++;
			}
			System.out.println(c + " int representation: " + (int) c + " number of same chars: "  + counter[index]);
		}
		System.out.println(numberOfUnique);

	}

}
