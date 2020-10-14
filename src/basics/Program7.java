package basics;
import java.util.Scanner;

/*Write a program to convert from upper case to lower case and vice versa
 * of an alphabet and print the old character and new character as shown in example
 * (Ex: a->A, M->m).
 */

public class Program7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Character: ");
		try {
		
			char c = sc.next().charAt(0);
			if(Character.isUpperCase(c))//checks whether character is upper case and converts it to lower case
				System.out.println(c + "->" + Character.toLowerCase(c));
			else { // checks whether character is lower case and converts it to upper case
				System.out.println(c + "->" + Character.toUpperCase(c));
			}
		}
		catch(Exception ex) {
			System.out.println("Exception occurred: " + ex.getMessage());
		}
	}

}
