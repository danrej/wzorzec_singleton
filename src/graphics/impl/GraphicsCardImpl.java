package graphics.impl;

import graphics.GraphicsCard;

public class GraphicsCardImpl implements GraphicsCard {
	
	private String name;
	private double price;
	
	public GraphicsCardImpl(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String getInformation() {
		return "Graphics Card: " + name + ", price: " + price;
	}
	
	public double getPrice() {
		return price;
	}
}
