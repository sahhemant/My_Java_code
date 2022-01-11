package Super_Final_keyword;

class getdata
{
public getdata(int a)	
{
	System.out.println("constructor from getdata class " +a );
}
}
     public class SuperwithConstructor extends getdata
{
	public SuperwithConstructor(int a)
	{
       super(a);
       System.out.println("hello super constructor ");
}

public static void main(String[]args) {
	SuperwithConstructor ob=new SuperwithConstructor(88);
	
}
}