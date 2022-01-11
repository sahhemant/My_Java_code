package Arrayprogram;

import java.util.Scanner;

public class Addarray {
	int sum=0;
public void add() {
	int[] x=new int[5];
	
	        Scanner sc=new Scanner(System.in);
			System.out.println("enter the five number");
			for(int a=0;a<=4;a++)
			{
				x[a]=sc.nextInt();	
				sum=sum+x[a];				
			}
			System.out.println("Addtion of total number is");
			System.out.println(sum);
			}			
            
public static void main(String[]args) {
	Addarray ob=new Addarray();
	ob.add();
}
}