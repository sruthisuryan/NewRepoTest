package Polymorphism;

public class Onsea {
	
	
	double amount;
	
	public void discount(double amount)
	{
	
		this.amount = amount;
		double discount = amount *0.4 ;
		double finalamount = amount - discount;
		System.out.println("Total amponut in onseason :" +amount);
		System.out.println("discount amponut is :" +discount);
		System.out.println("final total  amponut is :" +finalamount);
		System.out.println("-------------------------------------");
	}

}
