package by.academy.lesson5;

public class StringPool {

	public static void main(String[] args) {
		String s1 = "Cat";
		String s2 = "Cat";
		String s3 = new String("Cat");
		String s4 = s3.intern();
		String s5 = new String("Cat");

		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s1 == s3 : " + (s1 == s3));
		System.out.println("s3 == s5 : " + (s1 == s5));

		System.out.println("s1 equals s3 : " + s1.equals(s3));
		System.out.println("s1 == s4 : " + (s1 == s4));

//		String s = null;
//		System.out.println(testCat(s));
	}

	public static boolean testCat(String s1) {

		if (null == null) {
			System.out.println("нал равно нал");
		}
		return "Cat".equals(s1);
	}
}
