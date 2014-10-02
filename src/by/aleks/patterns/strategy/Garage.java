package by.aleks.patterns.strategy;

public class Garage {
	
	public static void main(String args[]){
		
		Audi audi = new Audi(new ElectricEngine());
		audi.drive();
		BMW bmw = new BMW(new HybridEngine());
		bmw.drive();
		VW vw = new VW(new GasEngine());
		vw.drive();
		
	}

}
