package Arrayprogram;

import java.util.Scanner;

public class PrimeArray 
	{
	
		public void digits()
		{
			int[] a = new int[5];
			Scanner ob= new Scanner(System.in);
			System.out.println("enter the 5 digits");
			for (int i=0;i<=4;i++)
			{
				a[i]=ob.nextInt();
				if(a[i]==0||a[i]==1)
				{
					System.out.println("not a prime number");
				}
				else
				{
					boolean z=false;
			for (int j=2;j<a[i];j++)
				
			{
				
			if(a[i]%j==0)
			{
				System.out.println("not a prime number");
				z=true;
				break;
			}
			}
			if(z==false)
			{
				System.out.println(" prime number");
			}
				}
			}
		}
		public static void main(String[]args)
		{
			
			PrimeArray obj = new PrimeArray();
			obj.digits();
		}
	}

