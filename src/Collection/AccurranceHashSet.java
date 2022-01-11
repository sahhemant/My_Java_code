package Collection;


import java.util.LinkedHashSet;
import java.util.Scanner;

public class AccurranceHashSet {
public void Word(String input) {
	char[]c=input.toCharArray();
	LinkedHashSet<Character>hs=new LinkedHashSet<Character>();
	for(int i=0;i<=c.length-1;i++)
	{
		hs.add(c[i]);
	}
	for(Character dd:hs)
	{
		int count=0;
		for(char dd1:c)
		{
			if(dd==dd1)
			{
				count++;
			}
		}
		System.out.println(dd + " is comes for " + count + " times ");
	}
	
}

public static void main(String[]args) {
	AccurranceHashSet ob=new AccurranceHashSet();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the input");
	String input=sc.next();
	ob.Word(input);
}	
}