package Arrayprogram;

import java.util.Scanner;

public class Charstring {
	int count;
	int i;
public void count (String word,char x) { 
	
	char[] c=word.toCharArray();
		
	for(int i=0;i<=c.length-1;i++)
	{
		
	if(x==c[i])
	{
		 count++; 	
	}	
    }	
	System.out.println(x +" are used in = " +  count + " times ");
    }
    public static void main(String[]args) {
	Charstring ob=new Charstring();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String word=sc.next();
	System.out.println("enter the char word");
	char x=sc.next().charAt(0);
	ob.count(word,x);
}
}