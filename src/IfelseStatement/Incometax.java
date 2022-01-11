package IfelseStatement;

import java.util.Scanner;

public class Incometax {
	float a;
	public void Tax (float salary)
	{
		if (salary<250000)
		{
			System.out.println("not in tax limit");
		}
		else if(salary>=250000 && salary<500000)
		{
			a=(salary*5)/100;
			System.out.println("tax: " + a);
			System.out.println("Total amount pay to govt.is:" +a);
		}
		else if(salary>=500000 && salary<1000000)
		{
			a=(salary*10)/100;
			System.out.println("tax: " + a);
			System.out.println("Total amount pay to govt.is:" +a);
		}
		else if(salary>=1000000 && salary<1500000)
		{
			a=(salary*15)/100;
			System.out.println("tax: " + a);
			System.out.println("Total amount pay to govt.is:" +a);
		}
		else if(salary>=1500000)
		{
			a=(salary*15)/100;
			System.out.println("tax: " + a);
			System.out.println("Total amount pay to govt.is:" +a);
		}
		
	}

	public static void main(String[]args) {
		Incometax ob=new Incometax();
		System.out.println("Enter your yearly salary");
		Scanner sc = new Scanner(System.in);
		float salary = sc.nextFloat();
		ob.Tax(salary);
		sc.close();
	}
	}
