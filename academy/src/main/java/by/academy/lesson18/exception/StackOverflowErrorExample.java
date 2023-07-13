package by.academy.lesson18.exception;

public class StackOverflowErrorExample {
	
	public static void recursivePrint(int num) {
		System.out.println("Number: " + num);

		if (num == 0)
			return;
		else
			recursivePrint(++num);
	}

	public static void main(String[] args) {
		
		StackOverflowErrorExample.recursivePrint(1);
	}
}
