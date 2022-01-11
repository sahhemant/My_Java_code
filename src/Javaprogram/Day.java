package Javaprogram;

import java.util.Scanner;

public class Day {
	public void Get(int number) {
		if(number==1)
		{
			System.out.println(number + "  Monday");
			}
		else if(number==2)
		{
			System.out.println(number + " Tuesday");
		}
		else if(number==3)
		{
			System.out.println(number + " Wednesday");
		}
		else if(number==4)
		{
			System.out.println(number + " Thursday");
		}
		else if(number==5)
		{
			System.out.println(number + " Friday");
		}
		else if(number==6)
		{
			System.out.println(number + " Saturday");
		}
		else if(number==7)
		{
			System.out.println(number + " Sunday");
		}
		else
		{
			System.out.println(number + " Invalid ");
	}
	}
public static void main(String[]args){
	Day ob=new Day();
	System.out.println("Pleasee enter the number");
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	ob.Get(number);
	sc.close();
}
}
