package Javaprogram;
public class Addsub {
int a,b,c;
public void addition() {
a=66;
b=44;
c=a+b;
System.out.println(c);
}
public void subtraction() {
	a=87;
	b=22;
	c=a-b;
	System.out.println(c);
}
public void multiplication() {
	a=11;
	b=22;
	c=a*b;
	System.out.println(c);	
}
public void division() {
	a=99;
	b=11;
	c=a/b;
	System.out.println(c);
}
public static void main(String[] args) {
Addsub ogg=new Addsub();
ogg.addition();
ogg.subtraction();
ogg.multiplication();
ogg.division();



}
}