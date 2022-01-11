package Forloop;

public class IncreasingStar {
public void Star()
{
	for(int i=1;i<=5;i++)
	{
		for (int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
public static void main(String[]args) {
	IncreasingStar ob=new IncreasingStar();
	ob.Star();
}
}
