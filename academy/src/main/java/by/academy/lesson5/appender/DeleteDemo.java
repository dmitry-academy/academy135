package by.academy.lesson5.appender;

public class DeleteDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("This is a test.");

		sb.delete(4, 7);
		System.out.println("После delete: " + sb);

		sb.deleteCharAt(0);
		System.out.println("После deleteCharAt: " + sb);
	}
}