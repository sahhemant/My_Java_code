package Javaprogram;

import java.util.Scanner;

public class Bigbasket {
	float a,b;
public void Getgst(float amount)  {
	if(amount<1000) {
		 a=(amount*5)/100;
		System.out.println("gst:" +a);
		b= amount+a;
		System.out.println("your total amount is:" +b);
	}
	else if(amount>=1000&&amount<2000) {
		a=(amount*10)/100;
		System.out.println("gst:" +a);
		b= amount+a;
		System.out.println("your total amount is:" +b);
	}
	else if(amount>=2000) {
	      a=(amount*18)/100;
	      System.out.println("gst:" +a);
		  b= amount+a;
		  System.out.println("your total amount is:" +b);
}
}	

public static void main(String[]args){
	Bigbasket ob =new Bigbasket();
	System.out.println("Pleasee enter product amount");
	Scanner sc = new Scanner(System.in);
	float amount = sc.nextFloat();
	ob.Getgst(amount);
	sc.close();
}
}