package by.academy.lesson8.inheritance;

import java.util.Objects;

public class HeavyBox extends Box {

	double weight;

	public HeavyBox(double heigth, double width, double depth) {
		super(heigth, width, depth);
	}

	public HeavyBox(double heigth, double width, double depth, double weight) {
		super(heigth, width, depth);
		System.out.println("HeavyBox constructor (4 fields)");
		this.weight = weight;
		getHeigth();
		this.getHeigth();
		super.getHeigth();
	}

	public double getHeigth() {
		System.out.println("alalala");
		return heigth;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(weight);
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
		HeavyBox other = (HeavyBox) obj;
		return Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

	@Override
	public String toString() {
		return "HeavyBox [heigth=" + heigth + ", width=" + width + ", depth=" + depth + ", weight=" + weight + "]";
	}

}
