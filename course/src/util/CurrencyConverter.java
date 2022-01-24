package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double conversorDollaReais( double valueDollar, double howManyDollars) {
		double total = howManyDollars * valueDollar;
		return total * IOF + total;
	}

}
