package by.academy.lesson4.packagedemo;

import by.academy.lesson4.packagedemo.a.Cat;

public class PackageDemo {

	public static void main(String[] args) {
		Cat cat = new Cat();
		by.academy.lesson4.packagedemo.b.Cat cat1 = new by.academy.lesson4.packagedemo.b.Cat();
		
		cat.test();
		cat1.test();
	} 

}
