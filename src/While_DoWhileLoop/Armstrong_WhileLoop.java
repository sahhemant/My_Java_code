package While_DoWhileLoop;

import java.util.Scanner;

public class Armstrong_WhileLoop {
public void Number(int num) {

	int monu=num;
	int sum=0;
	while(num>0)
	{		
		int a=num%10;
		num=num/10;
		sum=sum+(a*a*a);
	}
		if(sum==monu)
		{
			System.out.println("armstrong Number");
		}
		else
		{
			System.out.println("not armstrong");
		}		
	}	
public static void main(String[]args) {
	Armstrong_WhileLoop ob=new Armstrong_WhileLoop();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no");
		int num=sc.nextInt();
		ob.Number(num);
}
}