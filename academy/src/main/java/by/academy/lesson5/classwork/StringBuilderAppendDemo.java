package by.academy.lesson5.classwork;

public class StringBuilderAppendDemo {

	public static void main(String[] args) {
		String str = "I like Java";
		StringBuilder sb = new StringBuilder(str);

		System.out.println(sb);

		sb.append(" and English");
		System.out.println(sb);

		sb.setCharAt(0, 'W');
		System.out.println(sb);

		sb.insert(2, "abc");
		System.out.println(sb);

		sb.replace(0, 5, "We ");
		System.out.println(sb);

		sb.delete(17, 24);
		System.out.println(sb);

		sb.deleteCharAt(1);
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);
	}

}
