package Arrayprogram;
import java.util.Scanner;

public class StringSum {
	int sum=0;
public void getvalue(String s) {
	char[] c=s.toCharArray();
	
	for(int i=0;i<=c.length-1;i++)
	{
		if(c[i]>='0' && c[i]<='9')
		{
			String out="";
			out=out+c[i];
		int out1 =Integer.parseInt(out);
		int a=out1%10;
		sum=sum+a;			
	}
	}
	System.out.println("sum of Integer value is :" + sum);	
}
public static void main(String[]args) {
	 StringSum ob=new StringSum();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the input");
	 String s=sc.next();
	 ob.getvalue(s);
}
}