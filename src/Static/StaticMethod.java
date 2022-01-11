package Static;

public class StaticMethod {
	static int a=90;
static public void display()
{
	System.out.println("1" +a);
}
public static void main(String []args) {
	display();
	XYZ.show();
}
}
class XYZ{
	static public void show()
	{
	System.out.println("2");
}
}