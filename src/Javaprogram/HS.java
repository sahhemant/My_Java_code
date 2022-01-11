package Javaprogram;


public class HS {
	public void Billgenerate(String name,long mobilenumber,String productname,float productcoast) {
		System.out.println("your name is:" +name);
		System.out.println("your mobile no is:" +mobilenumber);
		System.out.println("your product name is:" +productname);
		System.out.println("your product coast is:" +productcoast);
		
		 Ifelsecalculator ob=new  Ifelsecalculator();
		 
		float gst=ob.Getgst(productcoast);
		System.out.println("product GSt is:" +gst);
		
		float total=productcoast+gst;
		System.out.println("Your payble amount is:" +total);
	}
	public static void main(String[] args){
		HS ob=new HS();
		ob.Billgenerate("hemant sah",8006437309l,"shirt",10000);
	}

}


