package Arrayprogram;

import java.util.Scanner;

public class File {
	
public void Size() {
	        int[] x=new int[5];
	        Scanner sc=new Scanner(System.in);
			System.out.println("Enter the 5 number");	
			for(int a=0;a<=4;a++)
			{
				x[a]=sc.nextInt();
			}
			for(int a=0;a<=4;a++)
			{
			if(x[a]<20)
			{
				System.out.println(x[a] + "  the file is lessthan 20 ");
			}
			else if(x[a]>=20)
			{
				System.out.println(x[a]+ " the file is greaterthan 20 ");
			}
			
}
}
public static void main(String[]args) {
	File ob=new File();
	ob.Size();
	
	
}
}

