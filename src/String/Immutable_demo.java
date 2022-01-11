 package String;

public class Immutable_demo {
	public static void main(String[] args) {
		
		// string is Immutable original value can't be change
		String a="Piyush";
		String completedata = a.concat("sharma");
		System.out.println(completedata);
		System.out.println(a);
		
		// stringBuffer is mutable original value can be change
		StringBuffer sb = new StringBuffer("raja");
		StringBuffer actualvalie = sb.insert(4, "sharma");
		System.out.println(actualvalie);
		System.out.println(sb);
		
		// stringBuilder is mutable original value can be change
		StringBuilder sb1 = new StringBuilder("hemant");
		StringBuilder value = sb1.insert(6, "sah");
		System.out.println(value);
		System.out.println(sb1);
		}
	
	
}