package Inheritance;

class getdata
{
	public void A()
	{
		System.out.println("hello A method");
	}
}
class getadd extends getdata
{
	public void B()
	{
		System.out.println("hello B method");
	}
}
public class MultilevelInheritance extends getadd
{
    public void  C()
    {
    	System.out.println("hello C method");
    }
public static void main(String[]args)
{
	MultilevelInheritance ob=new MultilevelInheritance();
	ob.C();
	ob.A();
	ob.B();
}
}
