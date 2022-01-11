package Arrayprogram;

import java.util.Scanner;

public class Table2 {
	
	public void gettable() {

		int[] x=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 5 no");
		for(int a=0;a<=4;a++)
		{
		    x[a]=sc.nextInt();
		    System.out.println("table of " + x[a]);
		for(int i=1;i<=10;i++)
		{
     	System.out.println(x[a]+ "*"+ i + "=" + x[a]*i);		
		}
		}
	}
    public static void main(String[] args) {
	Table2	ob=new Table2();
    ob.gettable();
}
}
