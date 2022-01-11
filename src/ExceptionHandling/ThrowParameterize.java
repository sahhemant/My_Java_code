package ExceptionHandling;

import java.util.Scanner;

public class ThrowParameterize {

	public void a()
	{
		System.out.println("a method");
	}
	
	public void getvalidte(int age)
	{
		try 
		{
			if(age<18)
			{
			
				throw new Exception("is not eligible ! please try again");
			}
			else
			{
				System.out.println("is eligible");
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			main(null);
		}
	}
	
	public static void main(String[] args) 
	{
		ThrowParameterize ob = new ThrowParameterize();
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the age");
		int age = sc.nextInt();
		ob.getvalidte(age);
	}
}