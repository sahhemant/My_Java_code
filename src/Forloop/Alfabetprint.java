package Forloop;

import java.util.Scanner;

public class Alfabetprint {

public void latter(char input) {
	for(char i=input;i<='z';i++)
	{
		System.out.println(i);
	}
}
public static void main(String[]args) {
	Alfabetprint ob=new Alfabetprint();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the char");
	char input=sc.next().charAt(0);
	ob.latter(input);
}
}
