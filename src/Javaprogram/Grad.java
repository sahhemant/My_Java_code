package Javaprogram;

public class Grad {
	
	public void Student(String name,String collegename,long rollnumber) {
		System.out.println("your name is: " + name);
		System.out.println("your college name is: " + collegename);
		System.out.println("your roll number: " + rollnumber);
	}
	public void Subject(float english,float math,float hindi,float art,float science) {
		System.out.println("english number is: " + english);
		System.out.println("math number is: " + math);
		System.out.println("hindi number is: " + hindi);
		System.out.println("art number is :" + art);
		System.out.println("science number is: " + science);
		
		 float total=english+math+hindi+art+science;
		System.out.println("your total number is:" + total);
		//create ob Gradcalci class  & calling Gradcalci class
		Gradcalci ob= new Gradcalci ();
		//create a Define variable and calling Gradcalci by Define
		float percent=ob.Define(total);
		System.out.println("your total percent is:" + percent);
	}	
	    public static void main(String[]agrs) {
	    	Grad ob=new Grad();
		ob.Student("hemant","UTU",123456);
		ob.Subject(39, 35, 55, 43, 21);
			
	}
	}


