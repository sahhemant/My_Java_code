 package Abstraction;

abstract class Car
{
	public void wheels()
	{
		System.out.println("4 wheeles");
	}
	abstract public void seats();
	abstract public void colour();
	abstract public void price();
}
class Maruti extends Car  
{
	@Override
	public void seats() 
	{
		System.out.println("5 seats");
	}
	@Override
	public void colour() {
	System.out.println("red");	
	}
	@Override
	public void price() {
		System.out.println(1000000);		
	}
}
public class Abstract_Class {

	public static void main(String[] args) {
		Maruti ob = new Maruti();
		ob.colour();
		ob.price();
		ob.wheels();
		ob.seats();
	}
	
}
