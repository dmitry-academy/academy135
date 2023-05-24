package by.academy.lesson3.classwork;

public class IncrementDemo {

	public static void main(String[] args) {
		int i = 0;
		System.out.println(i);

		i = i + 1;
		System.out.println(i);

		i += 1;
		System.out.println(i);

		i++;
		System.out.println(i);

		++i;
		System.out.println(i);//4
		System.out.println();
		System.out.println(i++);//4
		System.out.println(i);//5
		System.out.println(++i);//6

	}

}
