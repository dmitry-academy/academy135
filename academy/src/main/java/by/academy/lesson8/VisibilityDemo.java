package by.academy.lesson8;

import by.academy.lesson8.visibility.a.A;
import by.academy.lesson8.visibility.b.B;

public class VisibilityDemo {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();

//		System.out.println(a.publicVariable);
//		System.out.println(a.privateVariable);
//		System.out.println(a.protectedVariable);
//		System.out.println(a.defaultVariable);

		a.sleep();
		b.sleep();
		
		A.staticTest();
		B.staticTest();
	}

}
