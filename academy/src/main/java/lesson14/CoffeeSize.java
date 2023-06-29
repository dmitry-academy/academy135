package lesson14;

public enum CoffeeSize implements Flyable {
	BIG(200, "hello") {
		@Override
		public void fly() {
			System.out.println("Im not flying, I'm a coffee");
		}
	},
	
	HUGE(300, "there"), 
	
	OVERWHELMING(450, "java");

	int volume;
	private String s;

	CoffeeSize(int volume, String s) {
		this.volume = volume;
		this.s = s;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	@Override
	public void fly() {
		System.out.println("Im flying");
	}

}

//public enum CoffeeSize implements Serializable, Comparable<CoffeeSize> {
//	BIG, HUGE, OVERWHELMING
//}
