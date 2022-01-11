package Arrayprogram;

import java.util.Scanner;

public class NormalSecondHighst {
	
public void Number(int []num) {
	int max=0;
	int secondmax =0;
	int min=num[0];
	int secondmin=num[1];
	for(int i=0;i<=4;i++)
	{
		if(num[i]>max)
		{
			secondmax=max;
			max=num[i];
		}
		else if(num[i]>secondmax)
		{
			if(max==num[i])
			{
				continue;
			}
			secondmax=num[i];
		}
		if(num[i]<min)
		{
			secondmin=min;
			min=num[i];
		}
		else if(num[i]<secondmin)
		{
			if(min==num[i])
			{
				continue;
			}
			secondmin=num[i];
		}		
	}
	System.out.println("maximum value is " + max);
	System.out.println("second maximum value is " + secondmax);
	System.out.println("minimum value is " + min);
	System.out.println("second minimum value is " + secondmin);
}
public static void main(String[]args) {
	NormalSecondHighst ob=new NormalSecondHighst();
	Scanner sc=new Scanner (System.in);
			System.out.println("enter the no");
			int [] num= new int [5];
			for(int i=0;i<=4;i++)
			{
				num[i]=sc.nextInt();
			}
			ob.Number(num);
}
}