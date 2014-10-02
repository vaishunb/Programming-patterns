package by.aleks.patterns.strategy;

public class Garage {
	
	public static void main(String args[]){
		
		Audi audi = new Audi();
		audi.drive();
		BMW bmw = new BMW();
		bmw.drive();
		VW vw = new VW();
		vw.drive();
		
	}

}
