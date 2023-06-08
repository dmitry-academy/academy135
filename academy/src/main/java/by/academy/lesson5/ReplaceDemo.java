package by.academy.lesson5;

public class ReplaceDemo {

	public static void main(String[] args) {
		String str = "Дедлайн по домашке будет в субботу";

		System.out.println(str);

		str = str.replace("субботу", "Воскресенье");
		
		str = str.replace('е', '!');
		
		System.out.println("After replace");
		System.out.println(str);
	}

}
