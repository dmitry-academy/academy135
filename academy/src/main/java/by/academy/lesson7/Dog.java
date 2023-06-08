package by.academy.lesson7;

import java.util.Objects;

public class Dog {
	String nickname;
	int age;

	public Dog() {
		super();
	}

	public Dog(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, nickname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return age == other.age && Objects.equals(nickname, other.nickname);
	}

}
