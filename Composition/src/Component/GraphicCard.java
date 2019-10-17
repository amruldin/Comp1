package Component;

public class GraphicCard {
	
	private String brand;
	private int series;
	private String memory;
	
	
	public GraphicCard() {
		super();
		
		this.brand = "Nvidia";
		this.series = 940;
		this.memory = "2GB";
		
		
	}


	
	public GraphicCard(String brand, int series, String memory) {
		super();
		this.brand = brand;
		this.series = series;
		this.memory = memory;
	}


	

	@Override
	public String toString() {
		return "GraphicCard [brand=" + brand + ", series=" + series + ", memory=" + memory + "]";
	}
	
	
	
	
	
	
	

}
