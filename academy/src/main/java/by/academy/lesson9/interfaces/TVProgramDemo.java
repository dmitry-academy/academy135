package by.academy.lesson9.interfaces;

import by.academy.lesson9.inheritance.Animal;
import by.academy.lesson9.inheritance.Cat;

public class TVProgramDemo {

	public static void main(String[] args) {

//		Animal a = new Cat();
//		Cat c = new Animal();

		TVProgram tvp = new TVProgramImpl();

		tvp.switchToChannel();
//		tvp.alalal();
	}

}
