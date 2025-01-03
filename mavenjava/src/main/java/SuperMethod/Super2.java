package SuperMethod;

public class Super2 extends Super1 {

	public static void main(String[] args) {
		
		Super2 ob = new Super2();
		ob.checkDivision();
	}

	
	public void checkDivision()
	{
		super.add(10, 5);
	super.cal(sum);
	
		System.out.println(" sum of 2 number is : "+sum);
		
		if(sum % 10 ==0)
		{
			System.out.println("number divisible by 10");
		}
		else
		{
			System.out.println("not divisible by 10");
		}
	}
}
