package lesson14;

public class CoffeeSizeDemoStructure {

	public static void main(String[] args) {
		CoffeeSize cs = CoffeeSize.BIG;
		CoffeeSize cs1 = CoffeeSize.BIG;
		System.out.println(cs.getS());
		System.out.println(cs.getVolume());

		cs.setS("alalal");
		System.out.println(cs.getS());

		System.out.println(CoffeeSize.BIG.getS());
		System.out.println(cs1.getS());

		CoffeeSize.BIG.fly();
		CoffeeSize.OVERWHELMING.fly();
		CoffeeSize.HUGE.fly();
	}

}
