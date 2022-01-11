package Forloop;

import java.util.Scanner;

public class Tableprinting {
public void Table(int num) {
	for(int i=1;i<=10;i++)
	{
		System.out.println(num + "*" + i + "=" + num*i);
	}
}
public static void main(String[]args) {
	Tableprinting ob=new Tableprinting();
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	ob.Table(num);
}
}
