package Super_Final_keyword;

class Ravi
{
	public void getdata()
	{
		System.out.println("Hello parent class of method");
	}
}
public class SuperwithMethod extends Ravi
{
	public void getdata()
	{
		super.getdata();
		//System.out.println("Hello child class of method");
		
	}
	public static void main(String[] args)
	{
		SuperwithMethod ob = new SuperwithMethod();
		ob.getdata();
	}
}