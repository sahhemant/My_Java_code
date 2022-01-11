package Constructor;

import java.util.Scanner;

public class ParameterizedConstructor {
	public void getdata()
	{
		int a=50;
		System.out.println("Getdata"+a);	
}
public ParameterizedConstructor(int a) 
{	
	
	System.out.println("default constructor "+a);	
}

public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enyter the input");
	int a = sc.nextInt();
	ParameterizedConstructor ob=new ParameterizedConstructor(a);
	 
}
}