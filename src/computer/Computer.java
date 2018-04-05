package computer;

import computer.impl.ComputerA;
import graphics.GraphicsCard;
import processor.Processor;
import ram.Ram;

public class Computer {
	
	private static Computer uniqueInstance;

	private String type;
	private double price;
	private GraphicsCard graphicsCard;
	private Processor processor;
	private Ram ram;
	private ComputerFactory computerFactory;
	
	private Computer() {
		type = "Mobile";
		computerFactory = new ComputerA();
		graphicsCard = computerFactory.createGraphicsCard();
		processor = computerFactory.createProcessor();
		ram = computerFactory.createRam();
		price = countPrice();
	}
	
	public static Computer getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Computer();
		}
		return uniqueInstance;
	}
	
	public double countPrice() {
		return graphicsCard.getPrice() + processor.getPrice() + ram.getPrice();
	}
	
	public String getInformation() {
		return "Typ: " + type + " cena ca³kowita: " + price + " \n" + graphicsCard.getInformation() + " \n" + processor.getInformation() + " \n" + ram.getInformation();
	}
}
