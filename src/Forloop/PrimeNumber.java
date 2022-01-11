package Forloop;

import java.util.Scanner;

public class PrimeNumber {
public void Number(int num) {
	if (num==0 || num==1) 
	{
		System.out.println(num + " not a prime number");
	}
	else
	{
		boolean b=false;
	for(int i=2;i<num;i++)
	{	
		if (num%i==0)
		{
			System.out.println(num + " not a prime number");
			b=true;
			break;
		}
	}	
		if(b==false)
		{
			System.out.println(num + " prime number");
			
		}
	}
}

public static void main(String[]args) {
	PrimeNumber ob=new PrimeNumber();
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	ob.Number(num);
}
}
