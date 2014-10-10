package by.aleks.patterns.observer;

public class Main {

	public static void main(String[] args) {
		
		StockBase stockBase = new StockBase();
		//Create to displays which will receive prices and show them.
		new StockDisplay(stockBase);
		new StockDisplay2(stockBase);
		
		//Create 3 price definers for each company and run them.
		Runnable applePriceDefiner = new StockPriceDefiner(stockBase, 1500, 101.80f, "AAPL");
		Runnable googlePriceDefiner = new StockPriceDefiner(stockBase, 2000, 553.52f, "GOOG");
		Runnable ibmPriceDefiner = new StockPriceDefiner(stockBase, 3000, 187.23f, "IBM");
		
		new Thread(applePriceDefiner).start();
		new Thread(googlePriceDefiner).start();
		new Thread(ibmPriceDefiner).start();

	}

}
