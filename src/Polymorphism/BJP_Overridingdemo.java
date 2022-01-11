package Polymorphism;

class Congress
{
	public int gettax(int amnt)
	{
		int tax=(amnt*5)/100;
		return tax;
	}
}
public class BJP_Overridingdemo extends Congress
{
	public int gettax(int amnt)
	{
		int tax=(amnt*18)/100;
		return tax;
	}
	public static void main(String[] args)
	{
		BJP_Overridingdemo ob = new BJP_Overridingdemo();
		int out = ob.gettax(10000);
		System.out.println(out);
	}
}

