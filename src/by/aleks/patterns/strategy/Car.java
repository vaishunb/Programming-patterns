package by.aleks.patterns.strategy;

public class Car {
	
	protected String name;
	protected Engine engine;
	protected String color;
	
	public void setEngine(Engine e){
		engine = e;
	}
	
	public void drive(){
		engine.fillUp();
		engine.startEngine();
		System.out.println("Your "+color+" "+name+" is on the road!");
	}
}
