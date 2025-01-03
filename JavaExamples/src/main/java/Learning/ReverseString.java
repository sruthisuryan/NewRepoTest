package Learning;

public class ReverseString {

	
	public static void main(String[] args) {
		
		
		
		//ReverseString obj = new ReverseString();
		
	
		ReverseString.rev("SRUTHI");

	}

	
	public static String rev(String name)
	{
	
		StringBuilder nam = new StringBuilder(name).reverse();
		System.out.println("Reversed String is :" + nam);
		return name;
		
	
		
	}
	
	
}
