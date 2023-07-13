package by.academy.lesson16.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Напишите методы union(Set<?>... set) и intersect(Set<?> ... set), 
//реализующих операции объединения и пересечения множеств.
// Протестируйте работу этих методов на предварительно заполненных множествах. 
public class Task4 {

	public static void main(String[] args) {
		List<String> list1 = List.of("a", "b", "c", "d");
		List<String> list2 = List.of("d", "e", "f", "c");

		Set<String> union = new HashSet<>(list1);
		union.addAll(list2);

		for (String s : union) {
			System.out.println(s);
		}
		System.out.println("------------");
		HashSet<String> intersect = new HashSet<>(list1);
		intersect.retainAll(list2);

		for (String s : intersect) {
			System.out.println(s);
		}
	}

	public static Set<String> union(Collection<String>... collections) {

		Set<String> union = new HashSet<>();

		for (Collection<String> c : collections) {
			union.addAll(c);
		}

		return union;

	}

}
