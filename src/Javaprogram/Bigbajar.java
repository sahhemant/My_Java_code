package Javaprogram;

public class Bigbajar {
	public void Billgenerate(String name,long mobilenumber,String productname,float productcoast) {
		System.out.println("your name is:" +name);
		System.out.println("your mobile no is:" +mobilenumber);
		System.out.println("your product name is:" +productname);
		System.out.println("your product coast is:" +productcoast);
		Bigbajarcalculater ob=new Bigbajarcalculater();
		float gst=ob.Gstbigbajar(productcoast);
		System.out.println("product GSt is:" +gst);
		float total=productcoast+gst;
		System.out.println("Your payble amount is:" +total);
	}
	public static void main(String[] args){
		Bigbajar ob=new Bigbajar();
		ob.Billgenerate("hemant sah",8006437309l,"shirt",1000);
	}

}
