package basics;

import java.util.Scanner;

/*Write a program that displays a menu with options
 * 1. Add 2. Sub Based on the options chosen,
 * read 2 numbers and perform the relevant operation.
 * After performing the operation, the program should ask the user if he wants to continue.
 * If the user presses y or Y, then the program should continue displaying the menu else the program should terminate.
 * [ Note: Use Scanner class, you can take help from the trainer regarding the same]
 */

public class Program20 {
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers:");
		try {
			System.out.println("Number1: ");
			int num1 = sc.nextInt(); //reading number1
			System.out.println("Number2: ");
			int num2 = sc.nextInt(); // reading number 2
			boolean continues = false;
			
			do{
				System.out.println("Enter the option: ");
				System.out.println("Add - 1\nSubtract - 2\nMultiply - 3\nDivide - 4");
				int option = sc.nextInt(); //reads the option for operation
				continues = operations(option, num1, num2);
			}while(continues);
			
			System.out.println("\nEnd!!! \nThank you!");
		}
		catch(Exception ex) {
			System.out.println("Exception Occurred: "+ ex.getMessage());
		}

	}
	
	public static boolean operations(int option, int num1, int num2) {
		switch(option) { // switch to perform the operation
		case 1:
			System.out.println("Addition: " + (num1+num2));
			break;
		case 2:
			System.out.println("Subtraction: " + (num1-num2));
			break;
		case 3:
			System.out.println("Multiplication: " + (num1*num2));
			break;
		case 4:
			System.out.println("Division: " + (num1/num2));
			break;
		default:
			System.out.println("Not a valid selection");
			break;
		}
		System.out.println("Do you want to continue???\n enter Yes or No");
		String reply = sc.next().toLowerCase();
		if(reply.equals("yes"))
			return true;
		else
			return false;
	}

}
