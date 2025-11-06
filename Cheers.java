//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String inputCheer = args[0];
            String times = args[1];
            int timesnum = Integer.parseInt(times);
            String newcheer = inputCheer.toUpperCase();
            String otherchercters = "AEFHILMNORSX"; 
            int numberOfCharacters = newcheer.length();
            int i=0;
            while (i < numberOfCharacters) {
                char currentLetter = newcheer.charAt(i);
                if (otherchercters.indexOf(currentLetter) == -1) {
                        System.out.println("Give me  a " + currentLetter + ": " + currentLetter + "!"); 
         }
                else {
                        System.out.println("Give me  an " + currentLetter + ": " + currentLetter + "!");
        }
                
                i++;
                
                
            }
                System.out.println("What does that spell?");
                for (int j = 0; j < timesnum; j++) {
                System.out.println(newcheer + "!!!");
                }

        }
}
