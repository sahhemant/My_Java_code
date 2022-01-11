package Javaprogram;

public class Bigbajarifelse {
	float a,b;
	
public void Billgenerate(String name,long mobilenumber,String productname,float productcost) {
		System.out.println("your name is:" +name);
		System.out.println("your mobile no is:" +mobilenumber);
		System.out.println("your product name is:" +productname);
		System.out.println("your productcost is:" +productcost);
}
public void condition(float productcoast) {
            if(productcoast<=1000) {
            	
			 a=(productcoast*5)/100;
			System.out.println("gst:" +a);
			b= productcoast+a;
			System.out.println("your total amount is:" +b);
		}
		else if(productcoast<=2000) {
			a=(productcoast*10)/100;
			System.out.println("gst:" +a);
			b= productcoast+a;
			System.out.println("your total amount is:" +b);
		}
		else if(productcoast>2000) {
		      a=(productcoast*18)/100;
		      System.out.println("gst:" +a);
			  b= productcoast+a;
			  System.out.println("your total amount is:" +b);
	}
	}
public static void main(String[]args){
	Bigbajarifelse ob =new Bigbajarifelse();
	ob.Billgenerate("hemant",8006437309l,"shirt",8000);
	ob.condition(1000);
 
}
}
