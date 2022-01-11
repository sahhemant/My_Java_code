  package ExceptionHandling;

import java.util.Scanner;

public class ThrowNonPara {
	
	public void getvalidte()
	{
		try 
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Please enter the age");
			int age = sc.nextInt();
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
			getvalidte();
		}
	}	
	public static void main(String[] args) {
		ThrowNonPara ob=new ThrowNonPara();
		ob.getvalidte();
	}
}