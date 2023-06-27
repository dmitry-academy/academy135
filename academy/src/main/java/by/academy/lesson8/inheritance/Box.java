package by.academy.lesson8.inheritance;

import java.util.Objects;

public class Box {

	private String privateName;
	public String publicName;
	String packageFriendlyName;
	
	protected double heigth;
	protected double width;
	protected double depth;

	public Box() {
		super();
	}

	public Box(double heigth, double width, double depth) {
		super();
		System.out.println("Box constructor (3 fields)");
		this.heigth = heigth;
		this.width = width;
		this.depth = depth;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	@Override
	public int hashCode() {
		return Objects.hash(depth, heigth, width);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Box other = (Box) obj;
		return Double.doubleToLongBits(depth) == Double.doubleToLongBits(other.depth)
				&& Double.doubleToLongBits(heigth) == Double.doubleToLongBits(other.heigth)
				&& Double.doubleToLongBits(width) == Double.doubleToLongBits(other.width);
	}

	@Override
	public String toString() {
		return "Box [heigth=" + heigth + ", width=" + width + ", depth=" + depth + "]";
	}

}
