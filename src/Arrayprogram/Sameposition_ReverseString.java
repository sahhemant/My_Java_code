package Arrayprogram;

import java.util.Scanner;

public class Sameposition_ReverseString {
public void ReverseString(String input) {
	String[] s=input.split(" ");
	String out="";
	for(int i=0;i<=s.length-1;i++)
	{
		char[] c = s[i].toCharArray();
		
	for(int j=c.length-1;j>=0;j--)
	{
		out=out+c[j];
	}
	    out=out+" ";
}
    System.out.println(out);

}
public static void main(String[]args) {
	Sameposition_ReverseString ob=new Sameposition_ReverseString();
	Scanner sc=new Scanner(System.in);
		System.out.println("enter the input");
		String input=sc.nextLine();
		ob.ReverseString(input);
	
	}
}