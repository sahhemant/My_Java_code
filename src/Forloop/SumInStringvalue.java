package Forloop;

import java.util.Scanner;

public class SumInStringvalue {
	 int sum=0;
	 
public void Number(String s) {
	
	for(int i=0;i<s.length();i++)
	{
		if(Character.isDigit(s.charAt(i)))
		{
			sum=sum+Character.getNumericValue(s.charAt(i));
		}
	}
	System.out.println(sum);	
}
public static void main(String[]args) {
	SumInStringvalue ob=new SumInStringvalue();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the input");
	String s=sc.next();
	ob.Number(s);
}
}