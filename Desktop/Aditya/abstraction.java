abstract class display
{
	void show()
	{
		System.out.println("This Method belongs to Abstract Class...");
	}
}
class childDisplay extends display
{
}
class abstraction
{
	public static void main(String[]args)
	{
		childDisplay obj=new childDisplay();
		obj.show();
	}
}
