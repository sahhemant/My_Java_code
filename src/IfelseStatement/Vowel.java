package IfelseStatement;

import java.util.Scanner;

public class Vowel {
	public void Getvowel(char input)
	{
		if(input=='a'||input=='e'||input=='i'||input=='o'||input=='u'||input=='A'||input=='E'||input=='I'||input=='O'||input=='U')
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
		
		Vowel ob = new Vowel();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the char");
		char input= sc.next().charAt(0);
		ob.Getvowel(input);
		
		
	}
}

