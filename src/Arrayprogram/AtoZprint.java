package Arrayprogram;

import java.util.Scanner;

public class AtoZprint {
	
public void latter() {
	char[] x =new char [26];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the 26 char");
	
	for(int a=0;a<=25;a++)
	{
		x[a]=sc.next().charAt(0);
	}
	for(int b=25;b>=0;b--)
	{
		System.out.println(x[b]);
	}
	
}
	public static void main(String[] args)
	{
		AtoZprint ob=new AtoZprint();
		ob.latter();
	}
}
