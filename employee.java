public class employee extends person
{
	private double salary;

	public employee(String name,int age,double salary)
	{
		super(name,age);
		this.salary=salary;
	}

	public double getSalary()
	{
		return salary;
	}

	public void setSalary(double salary)
	{
		this.salary=salary;
	}
}
