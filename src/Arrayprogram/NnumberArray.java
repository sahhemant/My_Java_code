package Arrayprogram;

import java.util.Scanner;

public class NnumberArray {
public void Nnumber() {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of an array");
	n=sc.nextInt();
	int[] x=new int[n];
	System.out.println("enter array element");
	for(int i=0;i<=n-1;i++)
	{
		x[i]=sc.nextInt();
}
}
public static void main(String[]args) {
	NnumberArray ob=new NnumberArray();
	ob.Nnumber();
}
}