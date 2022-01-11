package ExceptionHandling;

import java.util.Scanner;

public class RealCalci{ 

	public static void getdata()		{
			try 
			{
				Scanner sc = new Scanner(System.in);
						
					for(;;)
					{
						int input = sc.nextInt();
						int a= sc.nextInt();
						int c=a+input;
						System.out.println(c);
						System.out.println("For continue press 1");
						int choice= sc.nextInt();
						if(choice==1)
						{
							continue;
						}
						else
						{
							System.out.println("terminate");
							break;
						}					
					}
			}			
			 catch (Exception e) 
			{
				
			}
		}
	public static void main(String[] args) {
		
		getdata();
		
	}
	}