package basics;
import java.util.Scanner;

/*Intialize a character variable in a program
 * and if the value is alphabet then print "Alphabet".
 * if it’s a number then print "Digit"
 * and for other characters print "Special Character"*/

public class DetermineCharType {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter character: ");
			char ch = sc.next().charAt(0);
			
			if((ch >= 65 && ch <= 90) ||  (ch >= 97 && ch <= 122)) //checking the ASCII value of character to determine if it is an alphabet
				System.out.println("Entered value is alphabet");
			else if(ch >= 48 && ch <= 57) //checking the ASCII value of character to determine if it is a digit
				System.out.println("Entered value is digit");
			else //If above both conditions fail, then character is considered as special character
				System.out.println("Entered value is Special character");
		}
		catch(Exception ex) {
			System.out.println("Exception occureed: " + ex.getMessage());
		}

	}

}
