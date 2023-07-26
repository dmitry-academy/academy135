package by.academy.lesson18;

public class CloseableCatDemo {

	public static void main(String[] args) {

		try (CloseableCat cat = new CloseableCat()) {
			System.out.println("inside try-with-resourses: TRY");
		} catch (Exception e) {
			System.out.println("inside try-with-resourses: CATCH");
		} finally {
			System.out.println("inside try-with-resourses: FINALLY");
		}

	}

}
