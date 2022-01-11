package Super_Final_keyword;

final class XYZ
{
	 public void getdata()
	{
		System.out.println("from XYZ class method");
	}
}
public class Finalwithclass extends XYZ 
{
	public void data()
	{
	 System.out.println("from public class method");
	}
public static void main(String[]args) {
	Finalwithclass ob=new Finalwithclass();
	ob.data();
}
}
