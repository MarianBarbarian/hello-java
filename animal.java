public class animal 
{
	private String name;
	
	public animal(String name)
	{
		this.name=name;
	}

	public void attack(String n)
	{
		System.out.println(this.name+" attacks "+n);
	}

	public void setName(String name)
	{
		this.name=name;
	}

	public String getName()
	{
		return name;
	}
}

