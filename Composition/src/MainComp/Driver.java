package MainComp;
import Component.Processor;
import Component.GraphicCard;
import Laptop.Laptop;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		Laptop pc1 = new Laptop();
//		System.out.println(pc1);
//		
//		int core;
//		
//		core = pc1.getProcessor().getCore();
//		
//		System.out.println(core);
		
		
		Processor cpu = new Processor("intel","7200U", 7, 4, 3, "6MB","2.5", "3.1Ghz", "4.Ghz");
		GraphicCard gpu = new GraphicCard("Intel", 711, "4GB");
		
		Laptop gamingLaptop = new Laptop(17,cpu,"32Gb","2Tb",gpu,"Multylayer","backlit");
		
		System.out.println(gamingLaptop);
		System.out.println(gamingLaptop.gamingMode());
		System.out.println(gamingLaptop.getProcessor().getFrequency());
		
	}

}
