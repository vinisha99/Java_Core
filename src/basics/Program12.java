package basics;
import java.util.Scanner;

/*Write a program to check if a given number is prime or not*/
public class Program12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter a number: ");
			int num = sc.nextInt();
			
			//checks whether the number is prime or not by checking the remainder
			for(int i = 2; i <= Math.sqrt(num); i++) {
				if(num%i == 0) {
					System.out.println(num + " is not a Prime Number");
					return;
				}
			}
			System.out.println(num + " is a Prime Number");
			
		}
		catch(Exception ex) {
			System.out.println("Exception Occurred: "+ ex.getMessage());
		}

	}

}

/*				Scanner sc = new Scanner(System.in);
		System.out.println("");
		try {
			
			
		}
		catch(Exception ex) {
			System.out.println("Exception Occurred: "+ ex.getMessage());
		}*/
