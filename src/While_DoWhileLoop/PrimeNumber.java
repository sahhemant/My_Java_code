package While_DoWhileLoop;

import java.util.Scanner;

public class PrimeNumber {
public void Number(int num) {
	
	do
	{
		System.out.println(num+ "prime no");
		num++;
}
	while(num%2==1);
	if (num%2==1)
	{
		do
		{
			System.out.println(num+ "not a prime no");
			num++;
		}
while(num%2==0);
	}
}
public static void main(String[]args) {
	PrimeNumber ob=new PrimeNumber();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no");
	int num=sc.nextInt();
	ob.Number(num);
}
}
