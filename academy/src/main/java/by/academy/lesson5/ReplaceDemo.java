package by.academy.lesson5;

public class ReplaceDemo {

	public static void main(String[] args) {
		String str = "������� �� ������� ����� � �������";

		System.out.println(str);

		str = str.replace("�������", "�����������");
		
		str = str.replace('�', '!');
		
		System.out.println("After replace");
		System.out.println(str);
	}

}
