package Learning;

public class NumberSwap {
	
	public static void main(String[] args) {
		//NumberSwap sw =new NumberSwap();
		NumberSwap.swap(5, 10);
		NumberSwap.con("Hello", "World");
		NumberSwap.findMax(50, 10, 20);

	}
	
	public static void swap(int a,int b)
	{
		
		System.out.println("Before swap a= " +a +", b =" +b);
		int temp =a;
		a=b;
		b=temp;
		System.out.println("After swap numbers a is  = " +a + ", b is"+b);
		
	}
	
	public static String con(String str1,String str2)
	{
		String concatenation = str1 + str2;
		System.out.println("concatenation of string is " +concatenation);
		return concatenation;
		
		
		
	}
	
	public static int findMax(int a,int b,int c)
	{
		
		if(a>=b && a>=c)
		{
			
			System.out.println("A is max");
			return a;
		}
		else if (b >= a && b>=c)
		{
			System.out.println("B is max");
			return b;
		}else
		{
			System.out.println("C is max");
			return c;
		}
	}

}
