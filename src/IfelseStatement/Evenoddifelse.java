package IfelseStatement;

import java.util.Scanner;

public class Evenoddifelse {
	public void Getidentified (int number) {
		if(number% 2 == 0)
		{
			System.out.println("the given number is even");
			
		}
		else
		{
				System.out.println("the given number is odd");
			}
	}

		public static void main(String[]args) {
			Evenoddifelse ob=new Evenoddifelse();
			System.out.println("enter the given number");
			Scanner sc=new Scanner(System.in);
			int number=sc.nextInt();
			ob.Getidentified(number);
			sc.close();
			
			
		}
	}

