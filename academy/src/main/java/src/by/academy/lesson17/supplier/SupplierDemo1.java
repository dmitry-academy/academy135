package by.academy.lesson17.supplier;

import java.util.function.Supplier;

public class SupplierDemo1 {
	public static void main(String[] args) {

		String t = "One";

		Supplier<String> supplierStr = () -> {
			return t.toUpperCase();
		};

		System.out.println(supplierStr.get());

	}
}