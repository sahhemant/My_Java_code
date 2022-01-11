package Forloop;

import java.util.Scanner;

public class PrintNumber {
public void Number(int num) {
	for(int i=1;i<=num;i++)
	{
		System.out.println(i);
	}
}
public static void main(String[]args) {
	PrintNumber ob=new PrintNumber();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no");
	int num=sc.nextInt();
	ob.Number(num);
}
}
