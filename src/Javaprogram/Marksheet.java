package Javaprogram;

public class Marksheet {
	public void sah(String name,String fathername,String collegename,int rollnumber,float english,float math,float computer,float electronics, float science){
		
		System.out.println("your name is: "+ name);
		System.out.println("your fathername is: "+fathername);
		System.out.println("your rollnumber is: "+rollnumber);
		System.out.println("your collegename is: "+collegename);
		System.out.println("your english no is: "+english);
		System.out.println("your math no is: "+math);
		System.out.println("your computer no is: "+computer);
		System.out.println("your electronics no is: "+electronics);
		System.out.println("your science no is: "+science);
		
		float total=english+math+computer+electronics+science;
		System.out.println("your total no is:" +total);
		
		Sahclientpercent ob=new Sahclientpercent();
		
		float percent= ob.percentcalculater(total);
		System.out.println("your total percent is:" +percent);
	}
	 public static void main(String[] args) {
		Marksheet ob=new Marksheet();
		
		 ob.sah("hemant", "B.L.sah", "UTU", 01222 , 95, 70, 55, 80, 90);	
		 
	}
}


