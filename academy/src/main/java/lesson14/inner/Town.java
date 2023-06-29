package lesson14.inner;

import java.util.ArrayList;
import java.util.List;

public class Town {

	private String postCode = "33333";
	private int x = 3;
	private List<Street> streets = new ArrayList<>();

	public void printAllStreetX() {
		for (Street s : streets) {
			System.out.println(s.getHouseNumber());
		}
	}

	public Town() {
		super();
	}

	public Town(int x) {
		super();
		this.x = x;
	}

	class Street {
		private int house;
		private int houseNumber = 2;

		public Street() {
			super();
			streets.add(this);
		}

		public Integer getHouseNumber() {
			return houseNumber;
		}

		public class House {
			private int x = 0;
			private int houseNumber = 9999;

			public void test(int x) {
				System.out.println(x); // 1
				System.out.println(this.x);// 0
				System.out.println(Street.this.houseNumber);// 2
				System.out.println(Town.this.x);// 3
			}
		}

		public void printAddress() {
			System.out.println("Город " + Town.this);
			System.out.println("Индекс " + postCode);
			System.out.println("Улица " + this);
			System.out.println("Дом " + house);
			System.out.println("----------------");
		}

		public void testX(int x) {
			System.out.println(x);
			System.out.println(this.houseNumber);
			System.out.println(Town.this.x);
		}

	}

	public static void main(String[] args) {
		Town town = new Town();

		Town.Street street1 = town.new Street();
		Town.Street street2 = town.new Street();
		Town.Street street3 = town.new Street();

		Town.Street.House house1 = street1.new House();

		Town.Street street4 = new Town().new Street();

		Town.Street.House house = new Town().new Street().new House();
		System.out.println(house.getClass());
		System.out.println("----------------");
		house.test(1);

//		town.createStreet();
//		street1.printAddress();
//		street2.printAddress();
//
//		street1.testX(1);
	}

	public void createStreet() {
		Street street = new Street();
		street.house = 78;
		street.printAddress();
		System.out.println(postCode);
	}
}