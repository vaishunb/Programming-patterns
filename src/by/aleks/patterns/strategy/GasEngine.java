package by.aleks.patterns.strategy;

public class GasEngine implements Engine{

	@Override
	public void startEngine() {
		System.out.println("The internal combustion engine working properly. Let's go!");
	}

	@Override
	public void fillUp() {
		System.out.println("The tank is full!");		
	}

}
