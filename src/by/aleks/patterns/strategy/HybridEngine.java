package by.aleks.patterns.strategy;

/** Implements the algorithm using the strategy(Engine) interface */
public class HybridEngine implements Engine{
	
	@Override
	public void startEngine() {
		System.out.println("Both engines are working properly. Let's go!");
	}

	@Override
	public void fillUp() {
		System.out.println("The tank is full and the battery is charged!");		
	}

}
