package lesson14.inner;

public class Food {
	public static void main(String[] args) {

		Potato potato = new Potato() {
			@Override
			public void peel() {
				specificPeel();
				System.out.println("Чистим картошку в анонимном классе.");
			}

			public void specificPeel() {
				System.out.println("some specific method");
			}

			@Override
			public void dig() {
				System.out.println("dig potato");

			}
		};

		potato.dig();

//		Validator validator = new Validator() {
//			private final Pattern p = Pattern.compile("[a-z]+@gmail.com");
//
//			@Override
//			public Pattern getPattern() {
//				return p;
//			}
//		};

//		System.out.println(validator.isValid("test@gmail.com"));
//		Potato potato = new Potato();
//		potato.peel();

		Potato potato1 = new Potato() {
			@Override
			public void dig() {
				System.out.println("dig potato");
			}
		};
		
		potato1.dig();

	}
}