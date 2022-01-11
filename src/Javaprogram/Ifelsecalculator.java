package Javaprogram;

public class Ifelsecalculator {
	float a;
	public float Getgst(float amount)  {
		if(amount<1000) {
			 a=(amount*5)/100;
			
		}
		else if(amount>=1000 && amount<2000) {
			a=(amount*10)/100;
			
		}
		else if(amount>=2000) {
			a=(amount*18)/100;
		     
		}
		return a;
		
	}
}

