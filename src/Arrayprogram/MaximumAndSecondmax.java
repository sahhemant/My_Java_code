package Arrayprogram;

import java.util.Scanner;

public class MaximumAndSecondmax {
public void maxvalue(int [] n) {
	int max=0;
	int secondmax=0;
	for(int i=0;i<=4;i++)
	{
		if(n[i]>max)
		{
			secondmax=max;
			max=n[i];
		}
		else if(n[i]>secondmax) 
		{
			secondmax=n[i];
		}
}
	System.out.println("maximum value is " + max);
	System.out.println("secondmaximum value is " + secondmax);
}
public static void main(String[]args) {
	MaximumAndSecondmax ob=new MaximumAndSecondmax();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no");
	int []n=new int[5];
	for(int i=0;i<=4;i++)
	{
		n[i]=sc.nextInt();	
	}
	ob.maxvalue(n);
}
}
