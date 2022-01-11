package Arrayprogram;

import java.util.Scanner;

public class ArrayDuplicate {
 
	public void Number() {
		
		int [] a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first no");
		a[0]=sc.nextInt();
		
		for(int i=1;i<=a.length-1;i++)
		{
			int num=sc.nextInt();	
			
		for(int j=0;j<=i;j++)
		{
			if(a[j]==num)
			{
			System.out.print(num +" no is already exist \n"+ "enter new number \n");
			j--;
			num=sc.nextInt();
			}
		    }
		     a[i]=num;
		}
	    }	
		public static void main(String[] args) {
	    ArrayDuplicate ob=new ArrayDuplicate();
     	ob.Number();
}
}