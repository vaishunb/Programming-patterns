package by.aleks.patterns.observer;

import java.text.DecimalFormat;
import java.util.Random;

public class StockPriceDefiner implements Runnable {
	
	//Change frequence in miliseconds.
	private int changeFreq;
	private StockBase stockBase;
	private float defaultPrice;
	private String stockName;
	
	public StockPriceDefiner(StockBase stockBase, int changeFreq, float defaultPrice, String stockName){
		this.changeFreq = changeFreq;
		this.stockBase = stockBase;
		this.defaultPrice = defaultPrice;
		this.stockName = stockName;
	}

	@Override
	public void run() {
		updateStock();
		
	}
	
	/** Generates price chage in a range between -0.4 and 0.4 */
	private float generatePriceChange(){
		
		Random rand = new Random();
		float min = -0.4f;
		float max = 0.4f;
		
		// nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
		return rand.nextFloat()*(max-min+1);
	}
	
	/**
	 * Round the number for 2 digits after the dot.
	 */
	private float format(float price){
		DecimalFormat formatter = new DecimalFormat("#0.00");
		return Float.valueOf(formatter.format(price));
	}
	
	/**
	 * Sets new price for chosen company
	 */
	private void updateStock(){
		while(true){
			
			//Sets a new price for a choosen company.
			switch(stockName){
			case "AAPL": stockBase.setAaplPrice(format(defaultPrice+generatePriceChange())); 
			break;
			case "GOOG": stockBase.setGoogPrice(format(defaultPrice+generatePriceChange()));
			break;
			case "IBM": stockBase.setIbmPrice(format(defaultPrice+generatePriceChange()));
			break;
			default: System.out.println("Can't find "+stockName);
			}
			
			//Pause.
			try {
				Thread.sleep(changeFreq);
			} catch (InterruptedException e) {}
		}
	}

}
