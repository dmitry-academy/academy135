package lesson14.inner.classwork;

import java.util.regex.Pattern;

import by.academy.lesson8.interfaces.validator.Validator;

public class InnerClassesDemo1 {

	public static void main(String[] args) {
		System.out.println("Введите телефон: ");
		String phone = "+324234234234";
		Validator v = new Validator() {
			Pattern p = Pattern.compile("\\+324(23)[0-9]{7}");

			@Override
			public Pattern getPattern() {
				return p;
			}
		};
		System.out.println(v.isValid(phone));
	}

}
