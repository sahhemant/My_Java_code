package Javaprogram;

import java.util.Scanner;

public class Client {
public static void main(String[]args) {
	GST ob=new GST();
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter two input");
	long amount   =sc.nextLong();
	ob.gst(amount);
	
sc.close();	
}
}


