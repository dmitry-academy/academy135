package by.academy.lesson7;

public class DogDemo {

	public static void main(String[] args) {
		Dog dog0 = new Dog("Sharik");
		Dog dog1 = new Dog("Bobik");
		Dog dog2 = new Dog("Bobik");
		Dog dog3 = dog2;
		EmptyDog emptyDog = new EmptyDog();
//		Dog dog4 = null;
				
		System.out.println(dog0.equals(dog1));
		System.out.println(dog1.equals(dog2));
		System.out.println(dog2.equals(dog3));
//		System.out.println(dog4.equals(dog3));

	}

}
