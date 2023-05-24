package by.academy.lesson4;

public class BreakLabel {
	public static void main(String[] args) {
		outer: for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 10; j++) {
				if (j > i) {
					System.out.println();
					continue outer;
				}
				System.out.print(" " + (i * j));
			}

		}
		
//		l1: for (int i = 0; i < 10000; i++) {
//			l2: for (int j = 0; j < 10000; j++) {
//				System.out.println("i=" + i + " j=" + j);
////				if (j == 5) {
////					break l1;
////				}
//			}
//		}
//		System.out.println();
	}
}