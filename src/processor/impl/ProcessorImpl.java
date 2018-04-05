package processor.impl;

import processor.Processor;

public class ProcessorImpl implements Processor {
	
	private String name;
	private double price;

	public ProcessorImpl(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String getInformation() {
		return "Processr: " + name + ", price: " + price;
	}
	
	public double getPrice() {
		return price;
	}
}
