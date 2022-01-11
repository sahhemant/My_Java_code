  package Javaprogram;

public class Gstifelse {
	public void Bascis(String name,String address,String location,long mobilenumber) {
		System.out.println("your name is " + name);
		System.out.println("your address is " + address);
		System.out.println("your loction is " + location);
		System.out.println("your mobile is " + mobilenumber);
		}
	public void Product(String mobile,String laptop,String camera,String powerbank,String tv) {
		System.out.println("your mobile model is " + mobile);
		System.out.println("your laptop model is " + laptop);
		System.out.println("your camera model is " + camera);
		System.out.println("your powerbank model is " + powerbank);
		System.out.println("your tv model name is " + tv);
	}
	public void Amount(float mobileprice,float laptopprice,float cameraprice,float powerbankprice,float tvprice) {
		System.out.println("your mobile amount  is " + mobileprice);
		System.out.println("your laptop amount  is " + laptopprice);
		System.out.println("your camera amount  is " + cameraprice);
		System.out.println("your powerbank amount  is " + powerbankprice);
		System.out.println("your tv amount is " + tvprice);
		float Totalamount=mobileprice+laptopprice+cameraprice+powerbankprice+tvprice;
		System.out.println("your total amount  is " + Totalamount);
		
		Ifelsecalculator ob=new Ifelsecalculator();
		
		float gst=ob.Getgst(Totalamount);
		System.out.println("your gst  is " + gst);
		float finaltotal=Totalamount+gst;
		System.out.println("your paybelamount  is " + finaltotal);
		
		}
	public static void main(String[] args){
		
		Gstifelse ob=new Gstifelse();
		
		ob.Bascis("Hemant sah", "Mayur Vihar Phase one Delhi", "New Delhi", 8006437309l);
		ob.Product("one pluse", "HP", "Sony", "MI", "Sumsung");
		ob.Amount(4900, 4900, 3900, 1900, 7900);
		
	}
	}


