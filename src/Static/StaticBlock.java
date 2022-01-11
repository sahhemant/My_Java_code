package Static;

public class StaticBlock {
 public StaticBlock()
 {
	 System.out.println("hello constructor");
 }
 static
 {
	 System.out.println("hello static method");
 }
 public void getdata()
 {
	 System.out.println("hello getdata demethod");
 }
 class ab{
	 static
	 {
		 System.out.println("hello");
	 }
 }
public static void main(String[]args) {
	StaticBlock ob=new StaticBlock();
	ob.getdata();
}
}
