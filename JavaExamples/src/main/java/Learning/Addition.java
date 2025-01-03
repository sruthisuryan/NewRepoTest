package Learning;

public class Addition {

	
	int a;
	int b;
	public static void main(String[] args) {
		
		Addition add = new Addition();
		add.display();
				

	}
	
	public int addNumbers (int a,int b)
	{
		
		this.a=a;
		this.b =b;
		int sum = sum =a+b;
		System.out.println("sum is "+sum);
		return 0;
		
	}
	
	public void display()
	{
		this.addNumbers(4, 5);
		
	}

}
