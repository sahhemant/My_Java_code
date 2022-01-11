package IfelseStatement;

import java.util.Scanner;

public class Voter {
	public void getverifyage(int age)
	{
		if(age>=18 && age<=60)
		{
			System.out.println("eligble");
		}
		else if(age<18)
		{
			System.out.println("not eligble");
		}
		else
		{
			System.out.println("retired");
		}
			
	}
	public static void main(String[] args) {
		Voter ob = new Voter();
		System.out.println("Pleasee enter the age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		ob.getverifyage(age);
	}
}
