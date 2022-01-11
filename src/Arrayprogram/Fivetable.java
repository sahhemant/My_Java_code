 package Arrayprogram;

import java.util.Scanner;

public class Fivetable {
public void table(int a1) {
	for(int a=1;a<=10;a++)
	{
			System.out.println(a1+ "*"+ a + "=" + a1*a);
			
	}
}
	public void table1(int a2) {
	for(int a=1;a<=10;a++)
	{
			System.out.println(a2+ "*"+ a + "=" + a2*a);
			
	}
	}
	public void table3(int a3) {
	for(int a=1;a<=10;a++)
	{
			System.out.println(a3+ "*"+ a + "=" + a3*a);
			
	}
	}

public static void main(String[]args) {
	Fivetable ob=new Fivetable();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first no");
	int a1=sc.nextInt();
	ob.table(a1);
	System.out.println("enter the second no");
	int a2=sc.nextInt();
	ob.table1(a2);
	System.out.println("enter the third no");
	int a3=sc.nextInt();
	ob.table3(a3);	
}
}
