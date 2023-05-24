package by.academy.lesson3.classwork;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("������� ���� ���: ");
		String name = in.nextLine();
		System.out.println("���: " + name);
		in.close();
		System.out.println();
	}
}