package basics;

/* Write a program to check if the program has received command line arguments or not.
 * If the program has not received the values then print "No Values", else print all the values in a single line separated by ,(comma).
 * Eg1) java Example O/P: No values Eg2) java Example Mumbai Bangalore O/P: Mumbai,Bangalore
 * [Note: You can use length property of an array to check its length
 */

public class CheckCommandLineArguments {

	public static void main(String[] args) {
		//checks whether args is null or has values
		if(args.length == 0)
			System.out.println("No Values");
		else {
			for(int i =0; i < args.length; i++) {
				System.out.print(args[i]);
				if(i < args.length-1)
					System.out.print(",");
			}
		}

	}

}
