 package Inheritance;

class Ajaydemo
{
	public void getdata()
	{
		System.out.println("hello get data method");
	}
}
class ravidemo extends Ajaydemo
{
	public void showdata()
	{
		System.out.println("hello show data method");
	}	
}
class vijaydemo extends Ajaydemo
{
	public void printdata()
	{
		System.out.println("hello print data method");
	}
}
public class HybridInheritance extends vijaydemo 
{
	public void holddata()
	{
		System.out.println("hello hold data method");
	}
public static void main(String[]args)
{
	HybridInheritance ob=new HybridInheritance();
	ob.holddata();
	ob.printdata();
	ob.getdata();
	
	ravidemo ob1=new ravidemo();
	ob1.showdata();
	ob1.getdata();
	
	vijaydemo ob2=new vijaydemo();
	ob2.printdata();
	ob2.getdata();
}
}
