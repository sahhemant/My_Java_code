package IfelseStatement;

import java.util.Scanner;

public class SwitchWeekcase {
	public void Get(int input) {
		switch (input)
		{
			case 1:
			{ 
			System.out.println(input + " Monday is the 1st day of week");
			break;
			}	
		case 2:
		{
			System.out.println(input + " Tuesday is the 2nd day of week");
			break;
		}
		case 3:
		{
			System.out.println(input + "  Wednesday is the 3rd day of week");
			break;
		}
		case 4:
		{
			System.out.println(input  + " Thursday is the 4th day of week");
			break;
		}
		case 5:
		{
			System.out.println(input + "  Friday is the 5th day of week");
			break;
		}
		case 6:
		{
			System.out.println(input + "  Saturday is the 6th day of week");
			break;
		}
		case 7:
		{
			System.out.println(input + "  Sunday is Holiday");
			break;
		}
		default:
		{
			System.out.println(input + " Invalid");
	    }
		
	}
	}
public static void main(String[]args){
	SwitchWeekcase ob=new SwitchWeekcase();
	System.out.println("Pleasee enter the number");
	Scanner sc = new Scanner(System.in);
	int input=sc.nextInt();
	ob.Get(input);
	sc.close();
}
}


