package by.academy.lesson9.interfaces.statics;

public class InterfaceStaticMethodDemo {

	public static void main(String[] args) {
		MyIf m = new MyIfImpl();

		System.out.println(MyIf.staticMethod());
		System.out.println(MyIfImpl.staticMethod());
		System.out.println(m.staticMethod());
	}

}
