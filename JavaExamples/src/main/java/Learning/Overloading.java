package Learning;

public class Overloading {

	public static void main(String[] args) {
		
		Overloading overloading = new Overloading();
		overloading.cal(2, 10);
		overloading.cal(5, 10,8);
		

	}
	
	public int cal(int a,int b)
	{
		int add = a+b;
		System.out.println("sum is "+add);
		return add;
		
		
		
	}
public int cal(int a,int c,int d)
{
	int mul = a*c*d;
	System.out.println("multiplication is " +mul);
	
	return mul;
	
}
}
