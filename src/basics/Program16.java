package basics;

import java.util.Scanner;

/*Write a program to print * in Floyds format (using for and while loop) */
public class Program16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		try {
			int num = sc.nextInt();
			
			for(int i = 1; i <= num; i++) {//Outer for loop keep track of columns
				for(int j = 1; j <= i; j++) // inner for loop to print stars in the rows
					System.out.print("* ");
				System.out.println();
			}
		}
		catch(Exception ex) {
			System.out.println("Exception Occurred: "+ ex.getMessage());
		}

	}

}
