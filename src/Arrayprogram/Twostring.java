package Arrayprogram;

import java.util.Scanner;

public class Twostring {
	boolean z = false;
 public void word(String a,String b){
	 //break 'string a' to multiple string
   String[] s=a.split(" ");
 
  for(int i=0;i<=s.length-1;i++)
 {
	if(s[i].equals(b))
	{
		//break common string to characters
		char[]c=s[i].toCharArray();
	    String out="";
	    
		for(int j=c.length-1;j>=0;j--)
		{ 
			out=out+c[j];
			z = true;
		}
		System.out.println(out);	
	}
}
	if(z==false)
	    {
		System.out.println("not exist");
	   }	 
    }    
public static void main(String[]args) {
	 Twostring ob=new Twostring();
	 Scanner sc=new Scanner(System.in);
	System.out.println("enter the string a");
	String a=sc.nextLine();
	System.out.println("enter the string b");
	String b=sc.next();
	ob.word(a,b);	
 }	
}
