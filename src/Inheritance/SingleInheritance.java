package Inheritance;

class Rajademo  //like parent class
{
	public void A()
	{
		System.out.println("hello A method");
	}
}
public class SingleInheritance extends Rajademo  //like child class
{
   public void B()
   {
	   System.out.println("hello B method");
   }
public static void main(String[]args)
{
	SingleInheritance ob=new SingleInheritance ();
	ob.B();
	ob.A();
}
}
