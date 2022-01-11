package Arrayprogram;

import java.util.Scanner;

public class GetprimeArray {
	int i;
public void Getarray() {
	int[] x=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the 5 input");
	for(int i=0;i<=x.length-1;i++)
	{
	    x[i]=sc.nextInt();
		if(x[i]==0 || x[i]==1)
		{
			System.out.println(x[i] + " not a prime no ");		
		}
	else
	{
		int b=0;
		for(int j=2;j<x[i];j++)
		{
			if(x[i]%j==0)
			{
				System.out.println(x[i] + " not a prime no ");
				b=1;
				break;
			}	 
	        }
	if(b==0)
	{
		System.out.println(x[i] + " is a prime no ");
	}
	}
}
}
	public static void main(String[]args) {
	GetprimeArray ob =new GetprimeArray();
	ob.Getarray();
}
}