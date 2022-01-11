package Arrayprogram;

import java.util.Scanner;

public class SecondmaximumNumber {
	//swiping the no and get the position
public void Secondmax(int[]num) {
	
	for (int i=0;i<=num.length-1;i++)
	{
	for (int j=i+1;j<=num.length-1;j++)
	{	
		int number;
		if(num[i]>num[j])			
		{
			// condition true large no store in *number*
			number = num[i];  
            num[i] = num[j]; 
            //replace j position no to *number*
            num[j]=  number ;  
		}
	} 
	}
  	System.out.println("second highst number is " + num[num.length-2]);
	}
public static void main(String[]args) {
	SecondmaximumNumber ob=new SecondmaximumNumber();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int [] num=new int[5];
	for (int i=0;i<=num.length-1;i++)
	{
		num[i]=sc.nextInt();
	}
	ob.Secondmax(num);
}
}