package Javaprogram;

public class Demo {
	public void getadd (float a,float b) {
		float c=a+b;
		System.out.println(c);	
	}
	public void getsub(float x,float y) {
		float z=x-y;
		System.out.println(z);
	}
	public void getmulti(float d,float e) {
		float f=d*e;
		System.out.println(f);
	}
	public void getdivision(float g,float h) {
		float i=g/h;
		System.out.println(i);
	}
		public static void main(String[]args) {
		Demo ob=new Demo();
		
		System.out.println("enter two number for add");
		ob.getadd(22,44);
		
		System.out.println("enter two number for sub");
		ob.getsub(55,44);
		
		System.out.println("enter two number for multiplication");
		ob.getmulti(77,3);
		
		System.out.println("enter two number for division");
		ob.getmulti(77,11);
	
		
	}
			}


