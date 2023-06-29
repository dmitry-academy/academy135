package lesson14.inner;

public class ValidatorDemo {

	public static void main(String[] args) {
		Validator validator = new Validator() {
			@Override
			public boolean isValid(String value) {
				return true;
			}
		};

		System.out.println(validator.isValid("asdasd"));

		Validator v = new FirstLetterValidator();
		System.out.println(v.isValid("dasdasd"));
	}

}
