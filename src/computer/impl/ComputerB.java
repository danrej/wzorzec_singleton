package computer.impl;

import computer.ComputerFactory;
import graphics.GraphicsCard;
import graphics.impl.GraphicsCardImpl;
import processor.Processor;
import processor.impl.ProcessorImpl;
import ram.Ram;
import ram.impl.RamImpl;

public class ComputerB implements ComputerFactory {
	
	@Override
	public GraphicsCard createGraphicsCard() {
		return new GraphicsCardImpl("Radeon Rx 550 2G 16xPCI-E DDR5 Hdmi", 439.00);
	}
	
	@Override
	public Processor createProcessor() {
		return new ProcessorImpl("AMD A4-6300 FM2", 125.99);
	}
	
	@Override
	public Ram createRam() {
		return new RamImpl("Crucial Ballistix Sport DDR3 2x4GB 1600MHz CL9", 259.00);
	}

}
