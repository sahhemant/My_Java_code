package Super_Final_keyword;

class ABC
{
	final public void getdata()
	{
		System.out.println("from ABC class method");
	}
}
public class FinalwithMethod extends ABC 
{
	//public void getdata()
	{
		//System.out.println("from public class method");
	}
public static void main(String[]args) {
	FinalwithMethod ob=new FinalwithMethod ();
	ob.getdata();
}
}
