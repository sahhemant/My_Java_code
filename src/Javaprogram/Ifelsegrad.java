package Javaprogram;

public class Ifelsegrad {
public void Student(String name,String collegename,long rollnumber) {
	System.out.println("your name is: " + name);
	System.out.println("your college name is: " + collegename);
	System.out.println("your roll number: " + rollnumber);
}
public void Subject(float english,float math,float hindi,float art,float science) {
	System.out.println("your english number is: " + english);
	System.out.println("your math number is: " + math);
	System.out.println("your hindi number is: " + hindi);
	System.out.println("your art number is :" + art);
	System.out.println("your science number is: " + science);
	
	float total=english+math+hindi+art+science;
	System.out.println("your total number is:" + total);
	
	float percent=(total/500)*100;
	System.out.println("your total percent is:" + percent);
	
        if(percent<33)
        {
        	System.out.println("Result - fail");
        }
         else if(percent>=33 && percent<45)
        {
        	System.out.println("Result - Third division");
        	System.out.println("C-Grad");
        }
         else if(percent>=45 && percent<60)
        {
        	System.out.println("Result - Second division");
        	System.out.println("B-Grad");
        }
         else if(percent>=60 && percent<=100)
        {
        	System.out.println("Result - First division");
        	System.out.println("A-Grad");
        }
         else {
        	 System.out.println("Invalid");
         }
} 
	
public static void main(String[]agrs) {
	Ifelsegrad ob=new Ifelsegrad();
	//calling Student method using marks object of Student
	ob.Student("hemant","UTU",123456);
	//calling subject method using marks object of Subject
	ob.Subject(71, 99, 65, 78, 58);
		
}
}
