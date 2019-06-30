package entities;

public class CurrencyConverter {
	public static double price;
	public static final double IOF = 0.06;
	
	public static double cost(double quantity) {
		double aux = price * quantity;
		return aux + aux * IOF;
	}
}
