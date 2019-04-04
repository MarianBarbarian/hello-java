public class person // this is a class
{
	private String name;
	private int age;


	public person (String name, int age) //constructor's name needs to be the same of class name
	{
		this.name=name;
		this.age=age;
	}

	public void setName(String name)
	{
		this.name=name;
	}

	public void setAge(int age)
	{
		this.age=age;
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

}