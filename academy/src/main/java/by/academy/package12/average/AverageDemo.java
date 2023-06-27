package by.academy.package12.average;

public class AverageDemo {
	public static void main(String[] args) {

		Integer[] intArray1 = { 1, 2, 3, 4, 5 };
		Integer[] intArray2 = { 7, 2, 1, 7, 2 };

		Average<Integer> integerAverage = new Average<>(intArray1);
		System.out.println("Average (Integer): " + integerAverage.average());

		Average<Integer> integerAverage2 = new Average<>(intArray2);
		System.out.println("Average (Integer): " + integerAverage2.average());

		System.out.println(integerAverage.sameAvg(integerAverage));
		System.out.println(integerAverage.sameAvg(integerAverage2));

		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Average<Double> doubleAverage = new Average<>(doubleArray);
		System.out.println("Average (Double): " + doubleAverage.average());
//
		if (integerAverage.sameAvg(doubleAverage)) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
// 		Нельзя!
//		integerAverage= doubleAverage;
//		Average<int> doubleAverage = new Average<>(doubleArray);

// 		Нельзя!
//		String[] strArray = { "asd", "lalalala" };
//		Average<String> strAverage = new Average<>(strArray);

//		System.out.println("Среднее значения для Integer " + integerAverage.average());
//		System.out.println("Среднее значения для Double " + doubleAverage.average());

		// Не откомпилируется,
		// потому что String не является наследником Number
//		String[] strArray = { "1", "2", "3", "4", "5" };
//		Average<String> strAverage = new Average<>(strArray);
//
//		System.out.println("Среднее значения для String " + strAverage.average());
	}
}