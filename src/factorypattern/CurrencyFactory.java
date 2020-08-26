package factorypattern;

public class CurrencyFactory {
	
	public static Currency getCurrency(String country){
		if(country.equals("india")){
			return new Rupee();
		}else if(country.equals("sg")){
			return new SingDollar();
		}else{
			return new USDollar();
		}
	}

}
