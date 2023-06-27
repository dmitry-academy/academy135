package by.academy.lesson8.inheritance;

import java.util.Objects;

public class ColorBox extends Box {

	String color;

	public ColorBox(double heigth, double width, double depth) {
		super(heigth, width, depth);
	}

	public ColorBox(double heigth, double width, double depth, String color) {
		super(heigth, width, depth);
		System.out.println("ColorBox constructor (4 fields)");
		this.color = color;
	}

	public void test() {
		System.out.println(publicName);
		System.out.println(packageFriendlyName);
		System.out.println(heigth);
//		System.out.println(privateName);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(color);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ColorBox other = (ColorBox) obj;
		return Objects.equals(color, other.color);
	}

	@Override
	public String toString() {
		return "ColorBox [heigth=" + heigth + ", width=" + width + ", depth=" + depth + ", color=" + color + "]";
	}

}
