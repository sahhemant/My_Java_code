package Super_Final_keyword;

class Vijaydemo
{
	int a=10;
}
class Ajaydemo extends Vijaydemo
{
	int a=20;
	public void getvalue()
	{
		System.out.println(super.a);
		//System.out.println( a);
	}
}
public class SuperVaribal extends Ajaydemo
{
	int a=30;
	public void getdata()
	{
		System.out.println(super.a);
		//System.out.println(a);
	}	
public static void main(String[] args)
{
	SuperVaribal ob = new SuperVaribal();	
	ob.getvalue();
	ob.getdata();
}
}
