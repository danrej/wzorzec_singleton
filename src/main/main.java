package main;

import computer.Computer;
import computer.impl.ComputerA;
import computer.impl.ComputerB;
import graphics.GraphicsCard;
import graphics.impl.GraphicsCardImpl;
import processor.Processor;
import processor.impl.ProcessorImpl;
import ram.Ram;
import ram.impl.RamImpl;

public class main {

	public static void main(String[] args) {

		try {
			Computer computer = Computer.getInstance();
			System.out.println(computer.getInformation());

			System.out.println("");

			Computer desktop = Computer.getInstance();
			System.out.println(desktop.getInformation());
		} catch (Exception e) {
			System.out.println("Nie mo¿na utworzyæ kolejnego obiektu tej klasy");
		}

	}

}
