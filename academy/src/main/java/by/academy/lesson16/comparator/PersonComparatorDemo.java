package by.academy.lesson16.comparator;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class PersonComparatorDemo {
	public static void main(String[] args) {

		SortedSet<Person> set0 = new TreeSet<>();

		set0.add(new Person("Петя", "4Петев", 36));
		set0.add(new Person("Вася", "2Пупкин", 23));
		set0.add(new Person("Ваня", "3Ванин", 34));
		set0.add(new Person("Саша", "1Сашин", 25));

		PersonComparator personComparator = new PersonComparator();

		SortedSet<Person> set = new TreeSet<>(personComparator);

		set.add(new Person("Петя", "4Петев", 36));
		set.add(new Person("Вася", "2Пупкин", 23));
		set.add(new Person("Ваня", "3Ванин", 34));
		set.add(new Person("Саша", "1Сашин", 25));

		set.forEach(System.out::println);

		System.out.println();
		PersonAgeComparator ageComparator = new PersonAgeComparator();
		SortedSet<Person> set1 = new TreeSet<>(ageComparator);

		set1.add(new Person("Петя", "4Петев", 36));
		set1.add(new Person("Вася", "2Пупкин", 23));
		set1.add(new Person("Ваня", "3Ванин", 34));
		set1.add(new Person("Саша", "1Сашин", 25));

		set1.forEach(System.out::println);

		Comparator<Person> firstNameComparator = new Comparator<>() {

			@Override
			public int compare(Person o1, Person o2) {
				String firstName1 = o1.getFirstName();
				String firstName2 = o2.getFirstName();
				return firstName2.compareTo(firstName1);
			}

		};
		System.out.println();

		SortedSet<Person> set2 = new TreeSet<>(firstNameComparator);

		set2.add(new Person("Петя", "4Петев", 36));
		set2.add(new Person("Вася", "2Пупкин", 23));
		set2.add(new Person("Ваня", "3Ванин", 34));
		set2.add(new Person("Саша", "1Сашин", 25));
		set2.forEach(System.out::println);

	}
}