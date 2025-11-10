// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int Seedinput = Integer.parseInt(args[0]);
		String mode = args[1];
		boolean isVerbose = mode.equals("verbose");
		boolean Isconcise = mode.equals("concise");
		for(int cuurentseed = 1; cuurentseed <= Seedinput; cuurentseed++) {
			int count = 0; 
			int n = cuurentseed;
			if (isVerbose) {
				System.out.print(n + " ");
			}
			do {
				if (n % 2 == 0) {
					n = n / 2;
				} 
				else {
					n = 3 * n + 1;
				}

				if (isVerbose) {
					System.out.print(n + " ");
				}
				count = count + 1;				
			} while (n != 1);
			if (isVerbose) {
			System.out.println("(" + count + ")"); 
			} 
		}
		if (Isconcise) 
			System.out.println("Every one of the first "+ Seedinput + " hailstone sequences reached 1.");
		 if (isVerbose) 
			System.out.println("Every one of the first "+ Seedinput + " hailstone sequences reached 1.");
		 

			
			
}
}
		
	