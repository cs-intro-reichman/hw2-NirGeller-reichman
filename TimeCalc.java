public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        int minutesToAdd = Integer.parseInt(args[1]);
        int Totalmiuntes;
        int Totalhours;
        int Newhours;
        int Newminutes;

        Totalmiuntes = hours * 60 + minutesToAdd + minutes;
        Totalhours = Totalmiuntes / 60;
        Newhours = Totalhours % 24;
        Newminutes = Totalmiuntes -(Totalhours * 60);

		
		if (9< Newhours &&  Newhours<12) {
			if (Newminutes < 10) {
				System.out.print( Newhours + ":" + "0" + Newminutes + " AM");
			}
			else 
			System.out.println( Newhours + ":" + Newminutes + " AM");
			
		}
		else if ( Newhours == 12) {
			if (Newminutes < 10) {
				System.out.println( Newhours + ":" + "0" + Newminutes + " PM");
			}
			else 
			System.out.println( Newhours + ":" + Newminutes + " PM");
			
		}
		else if ( Newhours > 0 &&  Newhours < 10)
		{
			if (Newminutes < 10) {
				System.out.println( Newhours + ":" + "0" + Newminutes + " AM");
			}
			else 
			System.out.println( Newhours + ":" + Newminutes + " AM");
		}
		else if ( Newhours == 0) {
			if (Newminutes < 10) {
				System.out.println("0" + ":" + "0" + Newminutes + " AM");
			}
			else {
				
			System.out.println("0" + ":" + Newminutes + " AM");
			}
		}
			else if ( Newhours >12 &&  Newhours <24) {
				 Newhours =  Newhours - 12;
				if (Newminutes < 10) {
					System.out.println( Newhours + ":" + "0" + Newminutes + " PM");
				}
				else 
				System.out.println( Newhours + ":" + Newminutes + " PM");
			}
		
		    else if ( Newhours == 24) {
			if (Newminutes < 10) {
				System.out.println("0" + ":" + "0" + Newminutes + " AM");
			}
			else {
				
			System.out.println("0" + ":" + Newminutes + " AM");
			}
		}	
    }
}
