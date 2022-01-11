package Arrayprogram;

import java.util.Scanner;

public class AccurenceDemo {
public  void getdata(String input) {
	char [] c=input.toCharArray();
	
	for(int i=0;i<=c.length-1;i++)
	{
		char out=c[i];
		int count = 0;
		
		for(int j=0;j<=c.length-1;j++)
		{
		if(c[j]==out)
		{
			count++;
		}
		}
	System.out.println( out + " is comes " + count + " times ");
	}
}
public static void main(String[]args) {
	AccurenceDemo ob=new AccurenceDemo();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the input");
	String input=sc.next();
	ob.getdata(input);
}
}