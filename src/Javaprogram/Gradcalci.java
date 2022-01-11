package Javaprogram;

public class Gradcalci {
	
float a;
public float Define(float percent)  {
	
	a=(percent/500)*100;
	
	if(percent<33) 
	{
		System.out.println(" Fail");
		
	}
	else if(percent>=33 && percent<45) {

		System.out.println(" Third division");
	}
	else if(percent>=45 && percent<60) {
		
		System.out.println(" Second division");
	}
	else if(percent>=60 ) {
		
		System.out.println("  First division");
	}
	

	return a;
}
}