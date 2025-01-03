package Polymorphism;

public class OffSeason extends Onsea{
	
	double amount ;

	public static void main(String[] args) {
		OffSeason off = new OffSeason();
		off.discount(2000);

	}

	
	public void discount(double amount)
	{
		super.discount(1000);
		
		this.amount = amount;
		double discount = amount * 0.15;
		double finalamount = amount - discount;
		
		System.out.println("Total amponut in onseason :" +amount);
		System.out.println("discount amponut is :" +discount);
		System.out.println("final total  amponut is :" +finalamount);
	}
}
