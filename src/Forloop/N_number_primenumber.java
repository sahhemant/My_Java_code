package Forloop;

import java.util.Scanner;

public class N_number_primenumber {
	int i=0;
	int num=0;
	String primenumber="";
	
public void Number(int n) {
for(i=1;i<=n;i++)
{
	int count=0;
	for(num=i;num>=1;num-- )
	{
		if(i%num==0)
		{ 
			count=count+1;
		}
	}
	if(count==2)
	{
		primenumber=primenumber +i + " ";
	}
}
System.out.println("primenumber for up to " + n );
System.out.println(primenumber);	
	
}
public static void main(String[]args) {
	N_number_primenumber ob=new N_number_primenumber();
	Scanner sc =new Scanner (System.in);
	System.out.println("enter the number");
	int n =sc.nextInt();
	ob.Number(n);
}
	
}