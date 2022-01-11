package Forloop;

import java.util.Scanner;

public class AnyArmStrongNumber {
	public int countlength(int num) {
		int count=0;
		for(;num>0;)
		{
			count++;
			num=num/10;
		}
		return count;
	}
		public void Number(int num) {
			int monu=num;
			int out=0;
			int count=countlength(num);
			
			for(;num>0;)
			{
				int a=num%10;
				num=num/10;
				int sum=1;
			for(int j=1;j<=count;j++)
			{
				sum=(sum*a);
			}
			out=out+sum;	
		    }
		if(out==monu)
		{
			System.out.println("Armstront");		
		}
		else
		{
			System.out.println("not Armstront");
			
		}
		
	}
   public static void main(String[]args) {
	AnyArmStrongNumber ob=new AnyArmStrongNumber ();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the input");
	int num=sc.nextInt();
	ob.Number(num);
   }
}