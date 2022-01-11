package Javaprogram;

import java.util.Scanner;

public class ParameterizedDemo {
public void getadd (float a,float b) {
	float c=a+b;
	System.out.println(c);	
}
public void getsub(float x,float y) {
	float z=x-y;
	System.out.println(z);
}
public void getmulti(float d,float e) {
	float f=d*e;
	System.out.println(f);
}
public void getdivision(float g,float h) {
	float i=g/h;
	System.out.println(i);
}
	public static void main(String[]args) {
	ParameterizedDemo ob=new ParameterizedDemo();
	Scanner sc = new Scanner(System.in);
	System.out.println("enter two number for add");
	float a=sc.nextFloat();
	float b=sc.nextFloat();
	ob.getadd(a,b);
	System.out.println("enter two number for sub");
	float x=sc.nextFloat();
	float y=sc.nextFloat();
	ob.getsub(x,y);
	System.out.println("enter two number for multiplication");
	float d=sc.nextFloat();
	float e=sc.nextFloat();
	ob.getmulti(d,e);
	System.out.println("enter two number for division");
	float g=sc.nextFloat();
	float h=sc.nextFloat();
	ob.getmulti(g,h);
	sc.close();
	
}
		}
