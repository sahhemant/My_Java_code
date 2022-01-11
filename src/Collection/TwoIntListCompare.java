package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoIntListCompare {

		public static void getdata()
		{
			ArrayList<Integer> li1=new ArrayList<Integer>();
			ArrayList<Integer> li2=new ArrayList<Integer>();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the first list");	
			for(int i=0;i<=4;i++)
			{
				li1.add(sc.nextInt());
			}
			System.out.println("enter the second list");
			for(int i=0;i<=4;i++)
			{
				li2.add(sc.nextInt());
			}
			for(int dd1:li1)
			{
			for(int dd2:li2)
			{
			if(dd1==dd2)
			{
			System.out.println(dd1 + " match with " +dd2);	
			}
			else
			{
				System.out.println(dd1 +" not match with " +dd2);
			}
			li2.remove(new Integer (dd2));
			break;
			}
			}
		} 	
	public static void main(String[]args) {
		getdata();
	}
	}