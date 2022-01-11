package IfelseStatement;

import java.util.Scanner;

public class Monthswitch {
	public void Month(int num) {
		switch(num)
		{
		case 1:
		{
			System.out.println(num + " January ");
			break;
		}
		case 2:
		{
			System.out.println(num + " February ");
			break;
		}
		case 3:
		{
			System.out.println(num + " March ");
			break;
		}
		case 4:
		{
			System.out.println(num + " April ");
			break;
		}
		case 5:
		{
			System.out.println(num + " May ");
			break;
		}
		case 6:
		{
			System.out.println(num + " Jun ");
			break;
		}
		case 7:
		{
			System.out.println(num + " July ");
			break;
		}
		case 8:
		{
			System.out.println(num + " August ");
			break;
		}
		case 9:
		{
			System.out.println(num + " September ");
			break;
		}
		case 10:
		{
			System.out.println(num + " October ");
			break;
		}
		case 11:
		{
			System.out.println(num + " November ");
			break;
		}
		case 12:
		{
			System.out.println(num + " December ");
			break;
		}
		default:
		{
			System.out.println(num + " Invalid");
			break;
	    }
	}
	}
	public static void main(String[]args) {
		Monthswitch ob=new Monthswitch();
		System.out.println("Pleasee enter the number");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		ob.Month(num);
		sc.close();
	}
	}