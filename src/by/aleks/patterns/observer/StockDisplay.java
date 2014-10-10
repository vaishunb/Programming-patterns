package by.aleks.patterns.observer;

/**
 * The first stock display. It prints the prices when they change.
 * @author Alex
 *
 */
public class StockDisplay implements Observer {
	
	private float aaplPrice;
	private float googPrice;
	private float ibmPrice;
	
	public StockDisplay(Subject stockBase){
		//Adds the display to the list of observers.
		stockBase.registerObserver(this);
	}

	@Override
	public void update(float ibmPrice, float googPrice, float aaplPrice) {
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;
		this.ibmPrice = ibmPrice;
		display();
	}
	

	
	private void display(){
		System.out.println("Display 1:\nApple - "+aaplPrice+"\nGoogle - "+googPrice+"\nIBM - "+ibmPrice+"\n");
	}

}
