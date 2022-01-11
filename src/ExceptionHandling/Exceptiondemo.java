package ExceptionHandling;

public class Exceptiondemo {

	public void A()
	{
		System.out.println("Hello A method");
	}
	public void B()
	{
		try
		{
			int a=10/0;	 
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Issue in B method "+ e);
		}
		finally
		{
			System.out.println("Hello B method");
		}
	}
	public void C() 
	{
		System.out.println("Hello C method");
	}
	
	public static void main(String[] args)
	{
		Exceptiondemo ob = new Exceptiondemo();
		ob.A();
		ob.B();
		ob.C();
	}
}
