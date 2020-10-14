package basics;
import java.util.Scanner;

/*Write a program to check if a given number is odd or even.*/

public class CheckOddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a number: ");
			int num = sc.nextInt();
			if(num == 0) { //Returns even when number is 0
				System.out.println("Number is Even");
				return;
			}
			if(num%2 == 0) // If divisible by then even else odd
				System.out.println("Number is Even");
			else
				System.out.println("Number is Odd");
		}
		catch(NumberFormatException ex) {
			System.out.println("Exception occureed: " + ex.getMessage());
		}
		catch(Exception ex) {
			System.out.println("Exception occureed: " + ex.getMessage());
		}

	}

}
