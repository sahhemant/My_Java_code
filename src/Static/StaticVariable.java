package Static;

public class StaticVariable {
	int employId;
	String name;
	static String CollegeName="dbit";
	
	public StaticVariable(int employId,String name)
	{
		this.employId=employId;
		this.name=name;
		
}
public void display()
{
	System.out.println(employId + " " +name + " " + CollegeName);
}
public static void main(String[]args) {
	StaticVariable ob=new StaticVariable(101,"amit");
	ob.display();
	StaticVariable ob1=new StaticVariable(102,"arun");
	ob1.display();
	StaticVariable ob2=new StaticVariable(103,"aditi");
    ob2.display();
}
}