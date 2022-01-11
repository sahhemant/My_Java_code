package Collection;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ArrayListDemo2 {
	public static void getdata()
	{
		ArrayList<String> li= new ArrayList<String>();
		li.add("piyush");
		li.add("12344");
		li.add("hjggjkh");
		li.add("monu");
		li.add("hemant");
		for(String dd:li)
		{
			System.out.println(dd);
		}	
	}
	public static void main(String[] args) 
	{
		getdata();
	}
}

