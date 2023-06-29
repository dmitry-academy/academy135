package lesson14;

public class CoffeeSizeDemo {

	public static void main(String[] args) {
		System.out.println(CoffeeSize5.BIG);
		CoffeeSize cs1 = CoffeeSize.HUGE;
		CoffeeSize cs2 = CoffeeSize.BIG;
		CoffeeSize cs3 = CoffeeSize.BIG;
		CoffeeSize cs4 = CoffeeSize.BIG;

		switch (cs1) {
		case BIG:
			System.out.println("Coffee BIG");
			break;
		case HUGE:
			System.out.println("Coffee HUGE");
			break;
		case OVERWHELMING:
			System.out.println("Coffee OVERWHELMING");
			break;
		default:
			System.out.println("another coffee");
		}
	}

}
