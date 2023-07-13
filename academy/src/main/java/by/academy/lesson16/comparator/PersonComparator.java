package by.academy.lesson16.comparator;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
	@Override
	public int compare(Person o1, Person o2) {
		String lastNamePerson1 = o1.getLastName();
		String lastNamePerson2 = o2.getLastName();

		return lastNamePerson1.compareTo(lastNamePerson2);
	}
}