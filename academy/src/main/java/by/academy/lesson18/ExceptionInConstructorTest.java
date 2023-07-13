package by.academy.lesson18;

public class ExceptionInConstructorTest {

	public static void main(String[] args) {

		ConstructorException p = null;
		try {
			p = new ConstructorException(0);
		} catch (ArithmeticException e) {
			System.out.println("Гасим исключение конструктора.");
		}
		
		p.start();
		p.stop();
		System.out.println(p.getI());
	}
}