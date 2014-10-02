package by.aleks.patterns.strategy;

public class VW extends Car{
	
	public VW(){
		name = "Volkswagen";
		color = "black";
		setEngine(new GasEngine());
	}

}
