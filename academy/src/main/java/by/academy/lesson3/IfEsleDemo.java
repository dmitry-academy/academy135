package by.academy.lesson3;

public class IfEsleDemo {

	public static void main(String[] args) {

		int temperature = -13;

		if (temperature < -10) {
			System.out.println("������ ����� ������ ����� -10");
		} else if (temperature < -5) {
			System.out.println("������ �����");
		} else if (temperature < -3) {
			System.out.println("������ ������ ������");
		} else if (temperature < -2) {
			System.out.println("������ ������");
		} else if (temperature < 5) {
			System.out.println("����!");
		} else {
			System.out.println("����� ��� �����");
		}
	}

}
