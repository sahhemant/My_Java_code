package Arrayprogram;

import java.util.Scanner;

public class City {
public void Name() {
	String[] x=new String[10];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name of city");
	for(int a=0;a<=9;a++)
	{
		x[a]=sc.next();
	}
	for(int b=9;b>=0;b--)
	{
		System.out.println(x[b]);
	}
}
public static void main(String[]args) {
	City ob=new City();
	ob.Name();
	
}
}
