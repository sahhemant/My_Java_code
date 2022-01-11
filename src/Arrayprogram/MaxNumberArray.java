package Arrayprogram;

import java.util.Scanner;

public class MaxNumberArray {
public void Number(int [] num) {
	int max=0;
	for(int i=0;i<=4;i++)
	{	
		if(num[i]>max)
		{
			max=num[i];
		}
		}
	System.out.println(max + " maximum no");
}

public static void main(String[]args) {
	 MaxNumberArray ob=new MaxNumberArray();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the no");
	 int [] num=new int[5];
	 for(int i=0;i<=4;i++)
	 {
		 num[i]=sc.nextInt();
	 }
	 ob.Number(num);
}
}