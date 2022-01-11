package Javaprogram;

import java.util.Scanner;

public class Himanshu1 {
	
	float total,percent;
	public void Student(String name, String fathername, String rollno, String collegename)
	{
		System.out.println("Name : "+name);
		System.out.println("Father Name : "+fathername);
		System.out.println("Roll No : "+rollno);
		System.out.println("College Name : "+collegename);		
	}
	public void Subject(String math,String hindi,String english,String art, String science)
	{
	System.out.println("Math : "+math);
	System.out.println("Hindi : "+hindi);
	System.out.println("English : "+english);
	System.out.println("Art : "+art);
	System.out.println("Science : "+science);
	}
	public void Subt(float math,float hindi,float english,float art, float science)
	{
		Scanner ob= new Scanner(System.in);
				System.out.println("Enter the marks");
		math=ob.nextFloat();
		hindi=ob.nextFloat();
		english=ob.nextFloat();
		art=ob.nextFloat();
		science=ob.nextFloat();
		total=math+hindi+english+art+science;
System.out.println("Total : "+total);

        percent=(total/500)*100;
        System.out.println("Percentage : "+percent);
        
        if (percent>33)
        {
        	System.out.println("Fail");
        }
        else if(percent<33 && percent >45)
        {
        	System.out.println("Third Division");
        }
        else if(percent<45 && percent>60)
        {
        	System.out.println("Second Division");
        }
        else if(percent<60)
        {
        	System.out.println("first");
        }
	}
public static void main(String[] args)
{
	Himanshu1 sc= new Himanshu1();
	sc.Student("Sinchan Nohara","Harry Nohara","764372896468264","KAsukame defence");
	
	sc.Subt(5,2, 3, 4, 6);
	
}
	
}
