package Encapsulation;

public class POJOClass_Encapsulation {
	private String name;
	private String collgename;
	private int rollno;
	private String course;
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getCollgename() 
	{
		return collgename;
	}
	public void setCollgename(String collgename) 
	{
		this.collgename = collgename;
	}
	
	public int getRollno() 
	{
		return rollno;
	}
	public void setRollno(int rollno) 
	{
		this.rollno = rollno;
	}
	
	public String getCourse()
	{
		return course;
	}
	public void setCourse(String course) 
	{
		this.course = course;
	}
	
	public static void main(String[] args) 
	{
		POJOClass_Encapsulation ob = new POJOClass_Encapsulation();
		ob.setName("Hemant");
		ob.setCollgename("DBIT");
		ob.setRollno(123455);
		ob.setCourse("b.tech");
		System.out.println(ob.getName()+"\n"+ob.getCourse()+"\n"
				+ob.getCollgename()+"\n"+ob.getRollno());
	}
}