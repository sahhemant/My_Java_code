package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Listdemo2Name {

	public static void getdata()
	{		
	ArrayList<String> li= new ArrayList<String>();
	Scanner sc = new  Scanner(System.in);
	System.out.println("Please enter the num");
	
	for(int i=0;i<=9;i++)
	{
		li.add(sc.next());
	}
	
	for(String dd:li)
	{
		System.out.println(dd);
	}
}

public static void main(String[] args) {
	getdata();
}
}