package Arrayprogram;

import java.util.Scanner;

public class SwipingSecondmin {
public void Number(int[]num) {
	for(int i=0;i<=4;i++)
	{
		for(int j=i+1;j<=num.length-1;j++)
		{
			int minnum;
			if(num[i]<num[j])
			{
				minnum=num[i];
				num[i]=num[j];
				num[j]=minnum;			
			}
		}
	}
	System.out.println("second minimum value is " + num[5-2]);	
	}		

public static void main(String[]args) {
	SwipingSecondmin ob=new SwipingSecondmin();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no");
	int [] num=new int [5];
	for(int i=0;i<=4;i++)
	{
		num[i]=sc.nextInt();
	}
	ob.Number(num);
}
}