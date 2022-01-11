 package Abstraction;

	interface Subhamdemo
	{
		public void getdetails();
		public void ajaydemo();
	}
	interface Vijay
	{
		public void showdata();
		
	}
	public class Interface implements Subhamdemo,Vijay
	{
		@Override
		public void getdetails() {
			System.out.println("Getdetails");	
		}
		@Override
		public void ajaydemo() {
			System.out.println("Ajay demo");
			
		}
		@Override
		public void showdata() {
			System.out.println("Hello showdata");
			
		}
	public static void main(String[] args) {
		Interface ob = new Interface();
		ob.ajaydemo();
		ob.getdetails();
	}
	}