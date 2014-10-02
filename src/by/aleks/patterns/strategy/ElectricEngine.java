package by.aleks.patterns.strategy;

public class ElectricEngine implements Engine{
	
	@Override
	public void startEngine() {
		System.out.println("The electric engine working properly. Let's go!");
	}

	@Override
	public void fillUp() {
		System.out.println("The car is charged.");		
	}

}
