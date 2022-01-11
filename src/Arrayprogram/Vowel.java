package Arrayprogram;

import java.util.Scanner;

public class Vowel {
	
public void get() {
	char[] x=new char[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the 5 charter");
	for(int i=0;i<=4;i++)
	{
		x[i]=sc.next().charAt(0);
	}
	
	for(int i=0;i<=4;i++)
	{
		if(x[i]=='a'||x[i]=='e'||x[i]=='i'||x[i]=='o'||x[i]=='u')
		{
			System.out.println(x[i] + ": is a vowel");
	}
	else
	{
		System.out.println(x[i] + ": consonent");
}	
}
}
public static void main(String[]args) {
	Vowel ob=new Vowel();
	ob.get();
}
}
