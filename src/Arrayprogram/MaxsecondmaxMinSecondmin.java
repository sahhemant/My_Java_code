package Arrayprogram;

import java.util.Scanner;

public class MaxsecondmaxMinSecondmin {
	
public void Number(int[] num) {
	int max =0;
	int secondmax=0;
	int min=num[0];
	int secondmin=num[1];
	for(int i=0;i<6;i++)
	{
		if(num[i]>max)
		{
			secondmax=max;
			max=num[i];
		}
		else
		{
			if(num[i]>secondmax)
			{
				secondmax=num[i];
			}
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

	System.out.println(max);
	System.out.println(secondmax);
	System.out.println(min);
	System.out.println(secondmin);
}
public static void main(String[]args) {
	MaxsecondmaxMinSecondmin ob=new MaxsecondmaxMinSecondmin();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no");
	int [] num=new int[6];
	for(int i=0;i<6;i++)
	{
		num[i]=sc.nextInt();
	}
	ob.Number(num);
}
}