// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	     int inputed = Integer.parseInt(args[0]);
		 double pi = 0.0;
			int divider=3;
		 for (int i = 1; i <= inputed; i++) {
			 
			
			if (i==1) {
				pi= pi+1;
				
			}
			if  (i==2) 
			{
				pi= pi - (1.0/divider);
				
			}
			if (i%2 == 0 && i>2) 
			{
				divider= divider +2;
				pi= pi - (1.0/divider);


	}
	        else if (i%2 != 0 && i>2){
				divider= divider +2;
				pi= pi + (1.0/divider);
			}
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + pi*4);
	}
}
