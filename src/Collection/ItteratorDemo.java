package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ItteratorDemo {
	
		public static void getdata()
		{
			ArrayList<String> li= new ArrayList<String>();
			li.add("piyush");
			li.add("ajay");
			li.add("ajeet");
			li.add("ravi");
			
			Iterator<String> itr = li.iterator();
			while(itr.hasNext())
			{
				String data = itr.next();
			System.out.println(data);
				if(data.equals("ajay"))
				{
					itr.remove();
				}
			
			}		
			System.out.println(li);
		}
		
		
		public static void main(String[] args)
		{
			getdata();
		}
	}