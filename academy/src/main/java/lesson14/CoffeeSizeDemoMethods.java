package lesson14;

import java.util.Arrays;

public class CoffeeSizeDemoMethods {

	public static void main(String[] args) {
//		ordinal(), compareTo(), equals(), values() и valueOf().

		CoffeeSize cs0 = CoffeeSize.OVERWHELMING;
		CoffeeSize cs1 = CoffeeSize.OVERWHELMING;
		CoffeeSize cs2 = CoffeeSize.BIG;
		System.out.println(cs0.ordinal());

		System.out.println(cs0.compareTo(cs1));
		System.out.println(cs0.compareTo(cs2));
		System.out.println(cs2.compareTo(cs0));

		System.out.println(cs2.equals(cs1));
		System.out.println(cs0.equals(cs1));

		System.out.println(cs0 == cs1);

		System.out.println(CoffeeSize.values());
		System.out.println(Arrays.toString(CoffeeSize.values()));

		for (int i = 0; i < CoffeeSize.values().length; i++) {
			System.out.println(CoffeeSize.values()[i]);
		}

		for (CoffeeSize s : CoffeeSize.values()) {
			System.out.println(s);
		}

		String type = "BIG";

		System.out.println(type.getClass());
		System.out.println(CoffeeSize.valueOf(type));
		System.out.println(CoffeeSize.valueOf(type).getClass());

	}

}
