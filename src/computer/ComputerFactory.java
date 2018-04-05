package computer;

import graphics.GraphicsCard;
import processor.Processor;
import ram.Ram;

public interface ComputerFactory {
	
	GraphicsCard createGraphicsCard();
	Processor createProcessor();
	Ram createRam();

}
