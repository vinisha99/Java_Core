package basics;
import java.util.Scanner;

/*Initialize two character variables in a program and display the characters in alphabetical order.
 * Eg1) if first character is s and second is e O/P: e,s
 * Eg2) if first character is a and second is e O/P:a,e
 */

public class CharAlphabeticalOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter 1st character: ");
			char char1 = sc.next().charAt(0); //Reading 1st character
			System.out.println("Enter 2nd character: ");
			char char2 = sc.next().charAt(0); //Reading 2nd character
			if(char1 < char2) //checking the ASCII value to character to determine order
				System.out.println(char1 + ","+ char2);
			else
				System.out.println(char2 + ","+ char1);
		}
		catch(Exception ex) {
			System.out.println("Exception occureed: " + ex.getMessage());
		}

	}

}
