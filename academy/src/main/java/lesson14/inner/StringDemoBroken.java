package lesson14.inner;

import java.util.Random;

public class StringDemoBroken {

	static Random r1 = new Random() {
		@Override
		public int nextInt(int bound) {
			return -super.nextInt(bound) * 100;
		}
	};
	
	public static void main(String... strings) {
		Random r = new Random();

		for (int i = 0; i < 10; i++) {
			System.out.println(r.nextInt(10));
		}

		
		
		for (int i = 0; i < 10; i++) {
			System.out.println(r1.nextInt(10));
		}
	}
}
