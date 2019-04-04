public class Example
{
	public static void main(String [] args)
	{
		person object1 =  new person("Victor",27);

		person object2 = new person("Marian",30);

		person object3 = new person("Tyler",29);

		employee e1 = new employee("Jordan",26,12000);


		//System.out.println(e1.getName());

		animal animal1=new animal("OP Froggy");


		animal1.attack(object3.getName());
	}
}