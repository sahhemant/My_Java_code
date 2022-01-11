package Javaprogram;
public class Sah{
	int a,b,c;
	public void add() 
	{
	a=55;
	b=11;
	c=a+b;
	System.out.println(c);
	}
	public void subb() 
	{
		a=55;
		b=22;

		System.out.println(c=a+b);
	}
	public static void main(String[]ages) {
	Sah oc=new Sah();
	oc.add();
	oc.subb();
}
}

class Sah2 {
	int x,y,z;
	public void add() 
	{
	x=11;
	y=11;
	z=x+y;
	System.out.println(z);
	}
	public void subb() 
	{
		x=22;
		y=22;
		z=x-y;
		System.out.println(z);
	}
	public static void main(String[]ages) {
	Sah2 ob=new Sah2();
	ob.add();
	ob.subb();
	Sah oc=new Sah();
	oc.add();
	oc.subb();
}
}
	
	

	
