package ram.impl;

import ram.Ram;

public class RamImpl implements Ram {
	
	private String name;
	private double price;
	
	public RamImpl(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String getInformation() {
		return "RAM: " + name + ", price: " + price;
	}
	
	public double getPrice() {
		return price;
	}
}
