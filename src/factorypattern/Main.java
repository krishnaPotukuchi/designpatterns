package factorypattern;

public class Main {

	public static void main(String[] args) {

		Currency c = CurrencyFactory.getCurrency(args[0]);
		System.out.println(c.getSymbol());
		
	}

}
