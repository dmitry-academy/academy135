package lesson14.inner;

public class OuterClass {

	private String name;

	class InnerClass {

		String type;
		int age;

		public InnerClass() {
			super();
		}

		public InnerClass(String type, int age) {
			super();
			this.type = type;
			this.age = age;
		}

		public void printType() {
			System.out.println(type);
		}

		public void printAge() {
			System.out.println(age);
		}

		public void printName() {
			System.out.println(name);
		}
	}
}
