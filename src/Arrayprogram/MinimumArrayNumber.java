package Arrayprogram;

import java.util.Scanner;

public class MinimumArrayNumber {
public void Minnumber(int []num) {
	int min=num[0];
	for (int i=0;i<=4;i++)
	{
		if(num[i]<min)
		{
			min=num[i];
		}
	}	
	System.out.println(min + " minimum number");
    }

public static void main(String[]args) {
	 MinimumArrayNumber ob=new  MinimumArrayNumber();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number");
	 int [] num=new int[5];
	 for (int i=0;i<=4;i++)
	 {
		 num[i]=sc.nextInt(); 
	 }
	 ob.Minnumber(num);		
}	
}