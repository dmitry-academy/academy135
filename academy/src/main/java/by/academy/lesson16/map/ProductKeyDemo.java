package by.academy.lesson16.map;

import java.util.LinkedHashMap;
import java.util.Map;

//Изменяемые объекты в качестве ключа
public class ProductKeyDemo {
	public static void main(String[] args) {
		Map<String, Product> map = new LinkedHashMap<>();
		Product doll = new Product("Doll", 534d, "Belarus");
		Product box = new Product("Cube", 34d, "Belarus");
		Product car = new Product("Toy Car", 200d, "Belarus");

		map.put("Antoshka1", doll);
		map.put("Antoshka0", box);
		map.put("Child world", car);

//		System.out.println(map.get(doll));
//		doll.setCost(434d);
//
//		System.out.println(map.get(doll));

		map.forEach((k, v) -> System.out.println(k + ": " + v));

	}
}