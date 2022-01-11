package Polymorphism;

public class Overloading {
	
public void gettrainsearch(String trainname)
{
	System.out.println("shaimar");
}
public void gettrainsearch(int trainno)
{
	System.out.println("shaimar");
}
public void gettrainsearch(String stationto,String stationfrom)
{
	System.out.println("shaimar");
}
public static void main(String[]args) {
	Overloading ob=new Overloading();
	ob.gettrainsearch(123);
}
}
