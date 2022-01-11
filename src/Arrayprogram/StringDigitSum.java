package Arrayprogram;

public class StringDigitSum {
	
		public void getdata(String input)
		{
			char[] c = input.toCharArray();
			int out=0;
			for(int j=0;j<=c.length-1;j++)
			{
				if(Character.isDigit(c[j]))
				{
					String data=Character.toString(c[j]);
					int num = Integer.parseInt(data);
					out=out+num;
				}
			}
			System.out.println(out);
		}		
		public static void main(String[] args) {
			StringDigitSum ob = new StringDigitSum();
			ob.getdata("piyush1234jhkh$k6778");
		}
	}