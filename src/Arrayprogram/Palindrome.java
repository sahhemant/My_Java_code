package Arrayprogram;

import java.util.Scanner;

public class Palindrome {
	public void number(String input)
	{
		char[] c=input.toCharArray();
		String out="";
		
		for(int i=c.length-1;i>=0;i--)
		{
			out=out+c[i];
		}
			if(input.equals(out))
					{
				System.out.println(input + ": is pallindrom word  ");
					}
			else
			{
				System.out.println(input + ": is not pallindrom word  ");
			}
		}	
	
	public static void main(String[] args)
	{
		Palindrome ob = new Palindrome();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter input");
		String input = sc.next();
		ob.number(input);	
}
}