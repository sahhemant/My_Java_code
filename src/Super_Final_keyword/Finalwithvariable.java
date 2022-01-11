package Super_Final_keyword;

public class Finalwithvariable {

	 final int a=30;
	public void getdata() {
	//	a=70; can't change the value because of final variable
		System.out.println(a);
	}
	public static void main(String[]args) {
		Finalwithvariable ob=new Finalwithvariable();
		ob.getdata();
		
	}
	
}
