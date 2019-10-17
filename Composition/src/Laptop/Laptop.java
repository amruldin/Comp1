package Laptop;

import Component.GraphicCard;
import Component.Processor;

public class Laptop {
	
	
	private double screen;
	private Processor processor;
	private String ram;
	private String hardDrive;
	private GraphicCard graphicCard;
	private String opticalDrive;
	private String keyboard;
	
	
	public Laptop() {
		super();
		
		this.screen = 15.6;
		this.processor = new Processor();
		this.ram = "DDR4";
		this.hardDrive = "2TB";
		this.graphicCard = new GraphicCard();
		this.opticalDrive = "MultiLayer";
		this.keyboard = "Backlit";
		
	}
	
	
	


	
	
	public Laptop(double screen, Processor processor, String ram, String hardDrive, GraphicCard graphicCard,
			String opticalDrive, String keyboard) {
		super();
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.graphicCard = graphicCard;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
	}


	
	





	public Processor getProcessor() {
		return processor;
	}







	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
	
	
	
	
	
	







	public double getScreen() {
		return screen;
	}







	public void setScreen(double screen) {
		this.screen = screen;
	}







	public String getRam() {
		return ram;
	}







	public void setRam(String ram) {
		this.ram = ram;
	}







	public String getHardDrive() {
		return hardDrive;
	}







	public void setHardDrive(String hardDrive) {
		this.hardDrive = hardDrive;
	}







	public GraphicCard getGraphicCard() {
		return graphicCard;
	}







	public void setGraphicCard(GraphicCard graphicCard) {
		this.graphicCard = graphicCard;
	}







	public String getOpticalDrive() {
		return opticalDrive;
	}







	public void setOpticalDrive(String opticalDrive) {
		this.opticalDrive = opticalDrive;
	}







	public String getKeyboard() {
		return keyboard;
	}






	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}


	
	public String gamingMode()
	{
		processor.setFrequency(processor.getMaxFrequency());
		return "Sucsess!";

	}





	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", hardDrive=" + hardDrive
				+ ", graphicCard=" + graphicCard + ", opticalDrive=" + opticalDrive + ", keyboard=" + keyboard + "]";
	}
	
	
	

	
	

	
	
}
