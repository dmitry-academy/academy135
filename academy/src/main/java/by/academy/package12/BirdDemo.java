package by.academy.package12;

public class BirdDemo {
	public static void main(String... args) throws CloneNotSupportedException {

		Bird b = new Bird();
		b.setAge(1000);
		b.setMoney(10000);
		b.setName("mak dak");

		System.out.println(b);

		Bird cloned = b.wrapperClone();
		System.out.println(cloned);

	}
}
//by.academy.package12.Bird@2c7b84de
//by.academy.package12.Bird@3fee733d
