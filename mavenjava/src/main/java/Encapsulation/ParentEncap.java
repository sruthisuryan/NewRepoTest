package Encapsulation;

public class ParentEncap {
	
	private String name;
	private int age;
	
	public void setName(String name)
	{
		this.name = name;
		System.out.println("Name " +name);
	}
public  String getName()
{
	

	return name;
	
}

public void setAge(int age)
{
	System.out.println("Age :" +age);
	this.age =age;
}
public int getAge() {
	return age;
	
}
}
