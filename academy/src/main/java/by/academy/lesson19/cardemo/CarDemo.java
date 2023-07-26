package by.academy.lesson19.cardemo;

import by.academy.lesson19.Car;
import by.academy.lesson19.CarTypes;

public class CarDemo {

	public static void main(String[] args) {
		Car[] cars = { new Car(CarTypes.SPORT, 34000), new Car(CarTypes.COMPACT, 800), new Car(CarTypes.SPORT, 44000),
				new Car(CarTypes.BIG, 14000), new Car(CarTypes.COMPACT, 10000) };

		System.out.println("Sport car count: " + countByType(cars, CarTypes.SPORT));
		System.out.println("Big car count: " + countByType(cars, CarTypes.BIG));
		System.out.println("Compact car count: " + countByType(cars, CarTypes.COMPACT));

		Searchable searchableSportCars = new Searchable() {
			@Override
			public boolean test(Car car) {
				return CarTypes.SPORT.equals(car.getType());
			}
		};

		Searchable s = c -> c.getCost() > 20000;

		Searchable searchableCheapCars = new Searchable() {
			@Override
			public boolean test(Car car) {
				return 1000 < car.getCost();
			}
		};

		System.out.println("Sport car count: " + countCars(cars, searchableSportCars));
		System.out.println("Sport car count: " + countCars(cars, new Searchable() {
			@Override
			public boolean test(Car car) {
				return CarTypes.SPORT.equals(car.getType());
			}
		}));
		
		
		System.out.println("Sport car count: " + countCars(cars, c -> c.getCost() > 20000));
	}

	public static int countCars(Car[] cars, Searchable searchable) {
		int count = 0;
		for (int i = 0; i < cars.length; i++) {
			if (searchable.test(cars[i])) {
				count++;
			}
		}
		return count;
	}

	public static int countByType(Car[] cars, CarTypes type) {
		int count = 0;
		for (int i = 0; i < cars.length; i++) {
			if (type.equals(cars[i].getType())) {//
				count++;
			}
		}
		return count;
	}

	public static int countByPrice(Car[] cars, int price) {
		int count = 0;
		for (int i = 0; i < cars.length; i++) {
			if (price < cars[i].getCost()) {//
				count++;
			}
		}
		return count;
	}
}
