package Arrayprogram;

import java.util.Scanner;

public class MinimumAndSecondminimum {
public void Number(int []n) {
int min=n[0];
int secondmin=n[1];
	for(int i=0;i<=4;i++)
	{
		if(n[i]<min)
		{
			secondmin=min;
			min=n[i];
		}
		else if(n[i]<secondmin)
		{
			if(min==n[i])
			{
				continue;
			}
			secondmin=n[i];
		}
	}
	System.out.println("minimum value is " + min);
	System.out.println("secondminimum value is " + secondmin);
}

public static void main(String[]args) {
	MinimumAndSecondminimum ob=new MinimumAndSecondminimum();
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the no");
	int [] n=new int [5];
	for(int i=0;i<=4;i++)
	{
		n[i]=sc.nextInt();	
	}
	ob.Number(n);
}
}