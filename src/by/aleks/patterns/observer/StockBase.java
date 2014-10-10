package by.aleks.patterns.observer;

import java.util.ArrayList;

/**
 * The class has information about stock prices. Calls display classes when the prices updated.
 * @author Alex
 *
 */
public class StockBase implements Subject{
	
	private ArrayList<Observer> observerList; //The list of observers to notify.
	private float aaplPrice;
	private float googPrice;
	private float ibmPrice;
	
	
	public StockBase(){
		observerList = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observerList.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		observerList.remove(o);
		
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observerList){
			observer.update(ibmPrice, googPrice, aaplPrice);
		}
		
	}

	//Set new prices and notify observers.
	
	public void setAaplPrice(float price) {
		aaplPrice = price;
		notifyObservers();
	}

	public void setGoogPrice(float price) {
		googPrice = price;
		notifyObservers();
	}

	public void setIbmPrice(float price) {
		this.ibmPrice = price;
		notifyObservers();
	}
	
	

}
