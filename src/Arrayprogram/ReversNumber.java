 package Arrayprogram;

import java.util.Scanner;

public class ReversNumber {
public void Number(int num) {
	String out="";
	for(;num>0;)
	{
		
		int a=num%10;
		num=num/10;
		out=out+a;
}
	int out1 =Integer.parseInt(out);
	System.out.println(out1);
}

public static void main(String[]args) {
	ReversNumber ob=new ReversNumber();
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the input");
	int num=sc.nextInt();
	ob.Number(num);
	
}	
}