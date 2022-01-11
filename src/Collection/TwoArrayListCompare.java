package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoArrayListCompare {

	public static void getdata()
	{
		ArrayList<String> li1=new ArrayList<String>();
		ArrayList<String> li2=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first list");	
		for(int i=0;i<=4;i++)
		{
			li1.add(sc.next());
		}
		System.out.println("enter the second list");
		for(int i=0;i<=4;i++)
		{
			li2.add(sc.next());
		}
		for(String dd1:li1)
		{
		for(String dd2:li2)
		{
		if(dd1.equals (dd2))
		{
		System.out.println(dd2 + " match");	
		}
		else
		{
			System.out.println("not match");
		}
		li2.remove(dd2);
		break;
		}
		}
	} 	
public static void main(String[]args) {
	getdata();
}
}