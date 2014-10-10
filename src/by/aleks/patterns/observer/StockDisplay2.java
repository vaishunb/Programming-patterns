package by.aleks.patterns.observer;

/**
 * The second stock display. It prints the prices when they change.
 * @author Alex
 *
 */
public class StockDisplay2 implements Observer {
	
	private float aaplPrice;
	private float googPrice;
	private float ibmPrice;

	public StockDisplay2(Subject stockBase){
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
	
	//Print updated information.
	private void display(){
		System.out.println("Display 2:\nApple - "+aaplPrice+"\nGoogle - "+googPrice+"\nIBM - "+ibmPrice+"\n");
	}

}
