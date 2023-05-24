package by.academy.lesson3.tasks;

import java.util.Scanner;

//5. ¬вести с консоли 2 числа, найти большее, меньшее, 
//среднее арифметическое.
public class Task5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a > b) {
			System.out.println("Big one is:" + a);
			System.out.println("Smaller" + b);

		} else if (a < b) {
			System.out.println("Big one is:" + b);
			System.out.println("Smaller one is:" + a);
		}
		/// add calc avg
	}
}
