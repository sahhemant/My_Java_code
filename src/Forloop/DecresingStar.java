package Forloop;

public class DecresingStar {
	public void Star()
	{
		for(int i=1;i<=5;i++)
		{
			for (int j=i;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[]args) {
		DecresingStar ob=new DecresingStar();
		ob.Star();
	}
	
}
