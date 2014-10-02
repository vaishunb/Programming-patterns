package by.aleks.patterns.strategy;

public class BMW extends Car{
	
	public BMW(){
		
		name = "BWM 3";
		color = "gray";
		setEngine(new HybridEngine());
	}

}
