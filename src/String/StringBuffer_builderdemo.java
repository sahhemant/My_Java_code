package String;

public class StringBuffer_builderdemo {
	public static void main(String[] args)
	{
		long starttime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Test");
		for(int i=0;i<=1000000;i++)
		{
			sb.append("java");
		}
		long endtime = System.currentTimeMillis();
		System.out.println("String buffer is taken time is "+(endtime-starttime)+"ms");
	 starttime = System.currentTimeMillis();
	StringBuilder sbb = new StringBuilder("Test");
	for(int i=0;i<=1000000;i++)
	{
		sbb.append("java");
	}
	 endtime = System.currentTimeMillis();
	System.out.println("String builder is taken time is "+(endtime-starttime)+"ms");
	}
}