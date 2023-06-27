package by.academy.lesson8.deal;

import java.util.Arrays;
import java.util.Objects;

public class Deal {

	String address;
	User buyer;
	User seller;
	Product[] products;

	public Deal(String address, User buyer, User seller, Product[] products) {
		super();
		this.address = address;
		this.buyer = buyer;
		this.seller = seller;
		this.products = products;
	}

	public double calPrice() {

		double price = 0;
		for (Product p : products) {
			if (p == null) {
				continue;
			}
			price += p.calcFullPrice();
		}
		return price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(products);
		result = prime * result + Objects.hash(address, buyer, seller);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deal other = (Deal) obj;
		return Objects.equals(address, other.address) && Objects.equals(buyer, other.buyer)
				&& Arrays.equals(products, other.products) && Objects.equals(seller, other.seller);
	}

	@Override
	public String toString() {
		return "Deal [address=" + address + ", buyer=" + buyer + ", seller=" + seller + ", products="
				+ Arrays.toString(products) + "]";
	}

}
