package Inheritance;

class AB
{
	public void getdata()
	{
		System.out.println("hello getdata method");
	}
}
class DB extends AB
{
	public void showdata()
	{
		System.out.println("hello showdata method");
	}
}
public class HierarchicalInheritance extends AB
{
	public void printdata()
	{
		System.out.println("hello printdata method");
	}
public static void main(String[]args)
{
	HierarchicalInheritance ob=new HierarchicalInheritance ();
	ob.printdata();
	ob.getdata();
	
	DB ob1=new DB();
	ob1.showdata();
	ob1.getdata();
	
}
}
