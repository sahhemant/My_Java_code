package IfelseStatement;

import java.util.Scanner;

public class Leepyear {
	public void Result(int year) {
		if (year % 4 ==0 && year % 400 == 0)
		{
			System.out.println("it is leep year" );
		}
			else if(year % 100 == 0)
			{
				System.out.println("it is not a leep year");
		}
			else
			{
				System.out.println("not a leep year");
		}
	}
		public static void main(String[]args) {
			Leepyear ob=new Leepyear();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the year");
			int year=sc.nextInt();
			ob.Result(year);	
		
	}
	}
