package by.aleks.patterns.strategy;

public class Garage {
	
	// Here I do some tests of the strategy implementation
	public static void main(String args[]){
		
		// Three contexts (cars) following different strategies (engines).
		Audi audi = new Audi(new ElectricEngine());
		audi.drive();
		BMW bmw = new BMW(new HybridEngine());
		bmw.drive();
		VW vw = new VW(new GasEngine());
		vw.drive();
		
	}

}
