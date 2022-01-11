package Arrayprogram;

import java.util.Scanner;

public class Number {
	public void getdata()
	{
		int[] b=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the 5 no");
		for(int a=0;a<=4;a++)
		{  
			b[a]=sc.nextInt();
		}
		for(int k=4;k>=0;k--)
		{
			System.out.println(b[k]);
		}
	}
	public static void main(String[] args)
	{
		Number ob= new Number();
		ob.getdata();
	}

}

