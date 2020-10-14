package basics;
import java.util.Scanner;
/*Write a program to check if a given number is Positive, Negative, or Zero.*/

public class CheckPositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a number: ");
			int num = sc.nextInt();
			
			if(num > 0) //checks if the number is greater than 0
				System.out.println("Number is Positive");
			else if(num < 0) //checks if the number is less than 0
				System.out.println("Number is Negative");
			else //checks if the number is equal to 0
				System.out.println("Number is Zero");
		}
		catch(NumberFormatException ex) {
			System.out.println("Number Format Exception occurred: " + ex.getMessage());
		}
		catch(Exception ex) {
			System.out.println("Exception occurred: " + ex.getMessage());
		}

	}

}
