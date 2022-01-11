package Javaprogram;

import java.util.Scanner;

public class ScannerDemo{
	public void add(float a,float b) {
		float c=a+b;
		System.out.println(c);
		}
	
	
	public static void main(String[]args) {
		ScannerDemo ob=new ScannerDemo();
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter first number");
		float a=sc.nextFloat();
		System.out.println("enter second number");
		float b=sc.nextFloat();
		System.out.println("total result");
		ob.add(a,b);
	sc.close();	
		
		
	}
}