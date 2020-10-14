package basics;

import java.util.Scanner;

/*Write a program to reverse a given number and print
 * Eg1) I/P: 1234 O/P:4321
 * Eg2) I/P:1004 O/P:4001
 */

public class Program17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		try {
			int num = sc.nextInt();
			int reverse = 0;
			//using while loop to add units place digit and multiply it with 10 to reverse the number
			while(num != 0) { 
				reverse = reverse*10 + num%10;
				num = num/10;
			}
		System.out.println(reverse);
		}
		catch(Exception ex) {
			System.out.println("Exception Occurred: "+ ex.getMessage());
		}
	}

}
