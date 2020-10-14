package basics;

import java.util.Scanner;

/*Write a Java program to find if the given number is palindrome or not */
public class Program18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		try {
			int num = sc.nextInt();
			if(num/10 == 0) { //checks and returns the same number if it is single digit
				System.out.println("Given Number is a Palindrome");
				return;
			}
			int reverse = 0;
			while(num > reverse) {
				reverse = reverse*10 + num%10;
				num = num/10;
			}
			if(reverse == num || reverse/10 == num)
				System.out.println("Given Number is a Palindrome");
			else
				System.out.println("Given Number is not a Palindrome");
			
		}
		catch(Exception ex) {
			System.out.println("Exception Occurred: "+ ex.getMessage());
		}
	}

}
