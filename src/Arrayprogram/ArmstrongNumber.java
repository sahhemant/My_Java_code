package Arrayprogram;

import java.util.Scanner;

public class ArmstrongNumber {
public void Number(int num) {
	
		int out=0;
		int temp=num;
		for(;num>0;)
		{
			int a=num%10;
			num=num/10;
			out=out+(a*a*a);
		} 
		if(out==temp)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("not amrstrong");
	}
}

public static void main(String[]args) {
	 ArmstrongNumber ob=new ArmstrongNumber();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the number");
	 int num=sc.nextInt();
	 ob.Number(num);
}
}