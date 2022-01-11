package Collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void getdata()
	{
		ArrayList li= new ArrayList();
		li.add("piyush");
		li.add(12344);
		li.add("hjggjkh");
		li.add(1.2);
		li.add('c');
		
			System.out.println(li);
			li.add(5);
			System.out.println(li);
			li.add(2, 100);
			System.out.println(li);
			
			ArrayList li1= new ArrayList();
			li1.add(3014);
			li1.add("hemant");
			li.addAll(li1);
			System.out.println(li);
			System.out.println(li.get(4));
			//li.clear();
			//System.out.println(li);
			System.out.println(li.contains(88));
		}	
	
	public static void main(String[] args) 
	{
		getdata();
	}
}