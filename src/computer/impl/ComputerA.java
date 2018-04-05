package computer.impl;

import computer.ComputerFactory;
import graphics.GraphicsCard;
import graphics.impl.GraphicsCardImpl;
import processor.Processor;
import processor.impl.ProcessorImpl;
import ram.Ram;
import ram.impl.RamImpl;

public class ComputerA implements ComputerFactory {
	
	@Override
	public GraphicsCard createGraphicsCard() {
		return new GraphicsCardImpl("GeForce GTX 1050 OC 2GB GDDR5", 599.99);
	}
	
	@Override
	public Processor createProcessor() {
		return new ProcessorImpl("Intel Core i5-7500 3.4 GHz", 874.99);
	}
	
	@Override
	public Ram createRam() {
		return new RamImpl("Kingston DDR4 2x4GB 2133MHz CL13 HyperX Savage XMP 1.2V", 293.76);
	}

}
