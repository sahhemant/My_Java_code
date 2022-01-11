package IfelseStatement;

import java.util.Scanner;

public class VowelDemooo {
	public void Getvowel(char input)
	{
		if(input=='a')
		{
			System.out.println(input+"  is vowel");
		}
		else if(input=='e')
		{
			System.out.println(input+"  is vowel");
		}
		else if(input=='i')
		{
			System.out.println(input+"  is vowel");
		}
		else if(input=='o')
		{
			System.out.println(input+"  is vowel");
		}
		else if(input=='u')
		{
			System.out.println(input+"  is vowel");
		}
		
		else if(input=='A')
		{
			System.out.println(input+"  is vowel");
		}
		else if(input=='E')
		{
			System.out.println(input+"  is vowel");
		}
		else if(input=='I')
		{
			System.out.println(input+"  is vowel");
		}
		else if(input=='O')
		{
			System.out.println(input+"  is vowel");
		}
		else if(input=='U')
		{
			System.out.println(input+"  is vowel");
		}
		else
		{
			System.out.println(input+" consonant");
		}
	}
	public static void main(String[] args) 
	{
		
		VowelDemooo ob = new VowelDemooo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the char");
		char input= sc.next().charAt(0);
		ob.Getvowel(input);
		
		
	}
}
