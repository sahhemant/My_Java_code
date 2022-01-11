package Constructor;

public class DefaultConstructor {
	
	public void getdata()
	{
		int a=50;
		System.out.println("Getdata"+a);	
}
public DefaultConstructor()
{
	int b=50;
	System.out.println("default constructor "+b);
}
public static void main(String[]args){
	DefaultConstructor ob=new DefaultConstructor();
	ob.getdata();
}
}