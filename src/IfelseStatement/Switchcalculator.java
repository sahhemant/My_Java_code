package IfelseStatement;

import java.util.Scanner;

public class Switchcalculator {
	Scanner sc=new Scanner(System.in);
	double a=sc.nextDouble();
	double b=sc.nextDouble();
	public void Calculator(char input) {
		switch(input)
		{
		case '+':	
		{
			System.out.println("add = "+ (a+b));
			break;
		}
		case '-':	
		{
			System.out.println("sub = "+ (a-b));
			break;
		}
		case '*':	
		{
			System.out.println("multi = "+ (a*b));
			break;
		}
		case '/':	
		{
			System.out.println("divi = "+ (a/b));
			break;
		}
		default:
		{
			System.out.println("wrong");
		}
	}	
	}
	public static void main(String[]args) {
		Switchcalculator ob=new Switchcalculator();	
		ob.Calculator('+');
		ob.Calculator('-');
				
	}
	}