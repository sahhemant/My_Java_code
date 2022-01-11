package Javaprogram;

import java.util.Scanner;

public class Reportcard {
	public void sah(String name,String fathername,String collegename,int rollnumber,float english,float math,float computer,float electronics, float science){
		float total=english+math+computer+electronics+science;
		float percent=(total/500)*100;
		
		System.out.println("your name is: "+ name);
		System.out.println("your fathername is: "+fathername);
		System.out.println("your rollnumber is: "+rollnumber);
		System.out.println("your english no is: "+english);
		System.out.println("your math no is: "+math);
		System.out.println("your computer no is: "+computer);
		System.out.println("your electronics no is: "+electronics);
		System.out.println("your science no is: "+science);
		System.out.println("your total no is:" +total);
		System.out.println("your total percent is:"+percent);
		
		
	}
	public static void main(String[] args) {
		Reportcard ob=new Reportcard();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your english subject number");
		float english=sc.nextFloat();
		System.out.println("enter your math subject number");
		float math=sc.nextFloat();
		System.out.println("enter your computer subject number");
	    float hindi=sc.nextFloat();
	    System.out.println("enter your electronics subject number");
	    float science=sc.nextFloat();
	    System.out.println("enter your science subject number");	;
	    float art=sc.nextFloat();
		 ob.sah("hemant", "BLsah", "dbit", 25, english, math, hindi, art, science);	
	}
}



