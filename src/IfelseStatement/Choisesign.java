package IfelseStatement;

import java.util.Scanner;

public class Choisesign {
	int c;
	public int Add(int a, int b)
	{
		c=  a+b;
		return c;
	}
	public int sub(int a, int b)
	{
		c= a-b;
		return c;	
	}
	public int multi(int a, int b)
	{
		c= a*b;
		return c;
	}
	public int divi(int a, int b)
	{
		c= a/b;
		return c;
	}
	public static void main(String[] args)
	{
		Choisesign ob = new Choisesign();
		System.out.println("Please enter the choice \n"
				+ "for add press (+) \n"
				+ "for sub press (-) \n"
				+ "for multi press (*) \n"
				+ "for divi press (/) \n");
			Scanner sc = new Scanner(System.in);
			String choice = sc.next();
			
			int c = 0;
		if(choice.equals("+"))
		{
			System.out.println("Please enter the two no for addtion");
			int a = sc.nextInt();
			int b = sc.nextInt();
			c=ob.Add(a, b);
		}
		else if(choice.equals("-"))
		{
			System.out.println("Please enter the two no for subtraction");
			int a = sc.nextInt();
			int b = sc.nextInt();
			c=ob.sub(a, b);
		}
		else if(choice.equals("*"))
		{
			System.out.println("Please enter the two no for multiplication");
			int a = sc.nextInt();
			int b = sc.nextInt();
			c=ob.multi(a, b);
		}
		else if(choice.equals("/"))
		{
			System.out.println("Please enter the two no for division");
			int a = sc.nextInt();
			int b = sc.nextInt();
			c=ob.divi(a, b);
		}
		else
		{ 
			System.out.println("Wrong choice");
		}
		System.out.println(c);
			
	}
}
