package ExceptionHandling;

public class ScenariorsofJavaExceptions {
	public void a()
	{
		try 
		{
			//int a=50/0;
			//System.out.println(a);
			//String s=null;
			  //System.out.println(s.length());
			//String k="abc";
			//Integer.parseInt(k);
			int a[]=new int[4];
			a[5]=67;	
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
		public static void main(String[] args){
			ScenariorsofJavaExceptions ob=new ScenariorsofJavaExceptions();
			ob.a();		
			}
		}
