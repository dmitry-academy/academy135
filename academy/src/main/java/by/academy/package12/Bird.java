package by.academy.package12;

import by.academy.lesson8.deal.User;

public class Bird implements Cloneable {

	private String name;
	private int age;
	private double money;

	private User owner;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
//	@Override
//	public Object clone() {
//
//		Bird b = new Bird();
//		b.setAge(age);
//		b.setMoney(money);
//		b.setName(name);
//		return b;
//	}

	public Bird wrapperClone() throws CloneNotSupportedException {
		return (Bird) super.clone();
	}

	@Override
	public String toString() {
		return "Bird [name=" + name + ", age=" + age + ", money=" + money + "]";
	}

}
