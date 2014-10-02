package by.aleks.patterns.strategy;

public class Audi extends Car{
	
	public Audi(){
		
		name = "Audi";
		color = "yellow";
		setEngine(new ElectricEngine());
		
	}

}
