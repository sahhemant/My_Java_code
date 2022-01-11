package Static;

public class VariableStatic {
	static int x=1;
	public void get()
	{
		System.out.println(x);
		x++;
	}
	
public static void main(String[]args) {
	VariableStatic ob=new VariableStatic();
	ob.get();
	VariableStatic ob1=new VariableStatic();
	ob1.get();
	VariableStatic ob2=new VariableStatic();
	ob2.get();
}
}
