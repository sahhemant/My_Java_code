package Arrayprogram;

import java.util.Scanner;

public class ReverseString {
	public void getreverse(String input)
	{
		char[] c=input.toCharArray();
		String out="";
		
		
		for(int j=c.length-1;j>=0;j--)
		{
			out=out+c[j];
		}
		System.out.println(out);
		
	}
	
	public static void main(String[] args)
	{
		ReverseString ob = new ReverseString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter input");
		String input = sc.next();
		ob.getreverse(input);
	}
}

