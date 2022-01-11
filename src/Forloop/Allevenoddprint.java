package Forloop;

import java.util.Scanner;

public class Allevenoddprint {
	int sumeven=0;
	int sumodd=0;
public void Number(int num) {
	for(int i=1;i<=num;i++)
	{
		if(i%2==0)
		{
			System.out.println(i);
			sumeven+=i;
		} 
	}
	System.out.println("even number up to " + num);
	
	System.out.println("sum of even no is : " + sumeven);
	for(int i=1;i<=num;i++)
	{
		if(i%2!=0)
		{
			System.out.println(i);
			sumodd+=i;
		} 
	}
	System.out.println("odd number up to " + num);
	
	System.out.println("sum of odd no is : " + sumodd);
}
	public static void main(String[]args) {
		Allevenoddprint ob=new Allevenoddprint();
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number");
	int num=sc.nextInt();
	ob.Number(num);
}
}
